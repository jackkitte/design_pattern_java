package com.example;

public class ApplicationButton implements Button {
    private boolean enable;

    private Mediator mediator;

    public ApplicationButton(boolean enable, Mediator mediator) {
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
            mediator.consulting(Mediator.APPLICATION_PRESS);
        } else {
            System.out.println("アプリケーションは既に起動中です");
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
