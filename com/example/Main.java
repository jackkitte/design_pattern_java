package com.example;

public class Main {
    public static void main(String[] args) {
        SettingFactory factory = SettingFactory.getFactory();

        Setting userId = factory.getSetting("userId");
        System.out.println(userId.getJapaneseValue());
        System.out.println(userId.getEnglishValue());

        System.out.println();

        Setting userId2 = factory.getSetting("userId");
        System.out.println(userId2.getJapaneseValue());
        System.out.println(userId2.getEnglishValue());

        System.out.println();

        Setting password = factory.getSetting("password");
        System.out.println(password.getJapaneseValue());
        System.out.println(password.getEnglishValue());
    }
}
