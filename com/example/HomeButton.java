package com.example;

public class HomeButton implements Button {
    private boolean enable;

    private Mediator mediator;

    public HomeButton(boolean enable, Mediator mediator) {
        super();
        this.enable = enable;
        this.mediator = mediator;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void press() {
        if (enable == true) {
            mediator.consulting(Mediator.HOME_PRESS);
        } else {
            System.out.println("ホームボタンは現在無効状態です");
        }
    }

    @Override
    public boolean isEnable() {
        return enable;
    }

    @Override
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
