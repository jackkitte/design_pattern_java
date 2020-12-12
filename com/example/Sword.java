package com.example;

import com.example.Item;

public class Sword implements Item {
    private String name;

    public Sword(String name) {
        super();
        this.name = name;
    }

    @Override
    public void get() {
        System.out.println(name + "を獲得しました");
    }

    @Override
    public void use() {
        System.out.println(name + "で攻撃しました");
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
