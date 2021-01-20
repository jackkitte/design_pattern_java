package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();

        boolean play = true;

        String message = "h:ホームボタン, a:アプリケーションボタン, e:終了";

        while (play) {
            System.out.println(screen);
            System.out.println(message);

            Scanner sc = new Scanner(System.in);

            String line = sc.nextLine();

            if ("h".equals(line)) {
                screen.getHomeButton().press();
            } else if ("a".equals(line)) {
                screen.getApplicatioButton().press();
            } else if ("e".equals(line)) {
                play = false;
                System.out.println("終了します");
            } else {
                System.out.println("入力に誤りがあります");
            }

            System.out.println();
        }
    }
}
