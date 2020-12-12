package com.example;

import com.example.Item;

public class Potion implements Item {
    private String name;

    public Potion(String name) {
        super();
        this.name = name;
    }

    @Override
    public void get() {
        System.out.println(name + "を獲得しました");
    }

    @Override
    public void use() {
        System.out.println(name + "を使いました");
    }

    @Override
    public Item createClone() {
        Item item = null;

        try {
            item = (Item) clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }
}
