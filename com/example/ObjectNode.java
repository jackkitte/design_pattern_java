package com.example;

public class ObjectNode extends Node {
    @Override
    public Object parse(Context context) throws JsonParseException {
        Class<Employee> employeeClass = Employee.class;

        Object employee = null;

        try {
            employee = employeeClass.getDeclaredConstructor().newInstance();

            while(context.hasMoreTokens()) {
                context.nextToken();
                Node keyValueNode = new KeyValueNode(employee, employeeClass);
                keyValueNode.parse(context);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new JsonParseException(e.getLocalizedMessage());
        }

        return employee;
    }
}
