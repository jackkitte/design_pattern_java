package com.example;

public interface Button {
    public void setMediator(Mediator mediator);

    public void press();

    public boolean isEnable();

    public void setEnable(boolean enable);
}
