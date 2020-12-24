package com.example;

public class Main {
    public static void main(String[] args) {
        String path = "sample.txt";

        try {
            MacroCommand before = new MacroCommand();
            Command fileCheck = new FileCheckCommand(path);
            Command dbCheck = new DbCheckCommand();

            before.addCommand(fileCheck);
            before.addCommand(dbCheck);
            before.execute();

            MacroCommand main = new MacroCommand();
            Command fileWrite = new FileWriteCommand(path);

            main.addCommand(fileWrite);
            main.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
