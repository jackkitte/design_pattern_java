package com.example;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        Observer displayObserver = new EventDisplayObserver();
        Observer dbInsertObserver = new DbInsertObserver();

        Event event = new SendEvent("送信イベント");
        event.addObserver(displayObserver);
        event.addObserver(dbInsertObserver);

        Data data1 = new Data("key1", 1);
        Data data2 = new Data("key2", 2);
        Data data3 = new Data("key3", 3);

        event.execute(data1);
        System.out.println();

        event.execute(data2);
        System.out.println();

        event.execute(data3);
        System.out.println();

        List<Data> list = DataBase.findAll();
        System.out.println("データベースの中身");
        System.out.println(list);
    }
}
