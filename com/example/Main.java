package com.example;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new MysqlDbImpl());
        d1.showEmployeeList();

        Display d2 = new CustomDisplay(new PostgreDbImpl());
        d2.showEmployeeList();

        CustomDisplay d3 = new CustomDisplay(new MysqlDbImpl());
        d3.filterAge(25);
    }
}
