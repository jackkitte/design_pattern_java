package com.example;

public class Screen implements Mediator {
    private Button homeButton;

    private Button applicationButton;

    public Screen() {
        super();
        homeButton = new HomeButton(false, this);
        applicationButton = new ApplicationButton(true, this);
    }

    @Override
    public void consulting(int code) {
        switch (code) {
            case Mediator.HOME_PRESS:
                System.out.println("ホーム画面に戻ります");
                homeButton.setEnable(false);
                applicationButton.setEnable(true);
                break;
            case Mediator.APPLICATION_PRESS:
                System.out.println("アプリケーションを起動します");
                applicationButton.setEnable(false);
                homeButton.setEnable(true);
                break;
            default:
                break;
        }
    }

    public Button getHomeButton() {
        return homeButton;
    }

    public Button getApplicatioButton() {
        return applicationButton;
    }

    public String toString() {
        String result = null;

        if (homeButton.isEnable() == false) {
            result = "ホーム画面表示中です";
        } else if (applicationButton.isEnable() == false) {
            result = "アプリケーション画面表示中です";
        }

        return result;
    }
}
