package com.example;

public class PrintAdapter implements Print {
    Show show;

    public PrintAdapter() {
        super();
        show = new Show();
    }

    public void printStr(String str) {
        System.out.println("==========");
        show.showStr(str);
        System.out.println("==========");
    }

    public void printNumber(int value) {
        System.out.println("----------");
        show.showNumber(value);
        System.out.println("----------");
    }
}
