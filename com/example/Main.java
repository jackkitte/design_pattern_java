package com.example;

public class Main {
    public static void main(String[] args) {
        Text sampleText = new TextProxy();
        sampleText.setFilePath("sample.txt");
        sampleText.printAll();
    }
}
