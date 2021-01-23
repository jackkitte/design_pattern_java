package com.example;

public class SendEvent extends Event {
    public SendEvent(String eventName) {
        super(eventName);
    }

    @Override
    public void execute(Data data) {
        System.out.println("送信データ: " + data);

        noticeObserver(data);
    }
}
