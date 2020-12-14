package com.example;

public abstract class Unit {
    public abstract String getName();

    public abstract void printList(String prefix);

    protected void add(Unit unit) {}

    @Override
    public String toString() {
        return getName();
    }
}
