package com.example;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Item> itemMap = new HashMap<String, Item>();

    public void register(String name, Item item) {
        itemMap.put(name, item);
    }

    public Item create(String itemName) {
        Item item = (Item) itemMap.get(itemName);

        return item.createClone();
    }
}
