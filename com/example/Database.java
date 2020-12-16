package com.example;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Map<String, Setting> database = new HashMap<>();

    static {
        Setting userId = new Setting("userId", "ユーザーID", "USER_ID");
        database.put("userId", userId);

        Setting password = new Setting("password", "パスワード", "PASSWORD");
        database.put("password", password);
    }

    public static Setting getSetting(String key) {
        return database.get(key);
    }
}
