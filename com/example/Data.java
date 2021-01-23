package com.example;

public class Data {
    private String key;

    private int value;

    public Data(String key, int value) {
        super();
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "[key=" + key + ", value=" + value + "]";
    }
}
