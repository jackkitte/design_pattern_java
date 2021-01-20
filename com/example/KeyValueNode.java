package com.example;

import java.lang.reflect.Method;

public class KeyValueNode extends Node {
    private Object object;

    private Class<?> clazz;

    public KeyValueNode(Object object, Class<?> clazz) {
        super();
        this.object = object;
        this.clazz = clazz;
    }

    @Override
    public String parse(Context context) throws JsonParseException {
        String result = null;

        try {
            String token = context.getCurrentToken();
            String[] keyValue = token.split(":");

            String key = keyValue[0].trim().replace("{", "");
            String value = keyValue[1].trim().replace("}", "");

            String methodName = "set" + key.substring(0, 1).toUpperCase() + key.substring(1, key.length());
            System.out.println("methodName: " + methodName);

            Method setter = null;

            if (value.contains("\"")) {
                setter = clazz.getMethod(methodName, String.class);
                setter.invoke(object, value);
            } else {
                setter = clazz.getMethod(methodName, Integer.class);
                setter.invoke(object, Integer.parseInt(value));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new JsonParseException(e.getLocalizedMessage());
        }

        return result;
    }
}
