package com.example;

public abstract class AbstractProcess {
    protected abstract void before();

    protected abstract void process();

    protected abstract void after();

    public final void execute() {
        before();
        process();
        after();
    }
}
