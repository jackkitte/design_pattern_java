package com.example;

public class DbInsertObserver implements Observer {
    @Override
    public void update(Event event, Data data) {
        DataBase.insert(data);
        System.out.println("データベースに登録完了");
    }
}
