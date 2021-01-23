package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public abstract class Event {
    private String eventName;

    private List<Observer> observerList = new ArrayList<>();

    public Event(String eventName) {
        super();
        this.eventName = eventName;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void noticeObserver(Data data) {
        Iterator it = observerList.iterator();

        while (it.hasNext()) {
            Observer observer = (Observer) it.next();
            observer.update(this, data);
        }
    }

    public abstract void execute(Data data);
}
