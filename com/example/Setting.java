package com.example;

public class Setting {
    private String key;

    private String japaneseValue;

    private String englishValue;

    public Setting(String key, String japaneseValue, String englishValue) {
        super();
        this.key = key;
        this.japaneseValue = japaneseValue;
        this.englishValue = englishValue;
    }

    public String getJapaneseValue() {
        return japaneseValue;
    }

    public String getEnglishValue() {
        return englishValue;
    }
}
