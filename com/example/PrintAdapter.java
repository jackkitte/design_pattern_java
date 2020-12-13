package com.example;

public class PrintAdapter extends Show implements Print {
    public void printStr(String str) {
        System.out.println("==========");
        showStr(str);
        System.out.println("==========");
    }

    public void printNumber(int value) {
        System.out.println("----------");
        showNumber(value);
        System.out.println("----------");
    }
}
