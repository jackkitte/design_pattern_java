package com.example;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static List<Data> list = new ArrayList<>();

    public static void insert(Data data) {
        list.add(data);
    }

    public static List<Data> findAll() {
        return list;
    }
}
