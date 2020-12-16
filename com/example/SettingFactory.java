package com.example;

import java.util.HashMap;
import java.util.Map;

public class SettingFactory {
    private Map<String, Setting> pool = new HashMap<>();

    private static SettingFactory factory = new SettingFactory();

    private SettingFactory() {}

    public static SettingFactory getFactory() {
        return factory;
    }

    public synchronized Setting getSetting(String key) {
        Setting result = null;

        boolean exist = pool.containsKey(key);

        if (exist == true) {
            result = pool.get(key);
        } else {
            System.out.println("データベースから取得中: " + key);
            result = Database.getSetting(key);

            if (result == null) {
                return null;
            } else {
                pool.put(key, result);
            }
        }

        return result;
    }
}
