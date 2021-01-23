package com.example;

public class EventDisplayObserver implements Observer {
    @Override
    public void update(Event event, Data data) {
        System.out.println("イベント: " + event.getEventName());

        System.out.println("受信データ: " + data);
    }
}
