package com.example;

public class Main {
    public static void main(String[] args) {
        Unit salesDepartment1 = new Department("営業1部");
        Unit salesGroup1_1 = new Group("1課");
        Unit salesGroup1_2 = new Group("2課");
        salesDepartment1.add(salesGroup1_1);
        salesDepartment1.add(salesGroup1_2);

        Unit salesDepartment2 = new Department("営業2部");
        Unit salesGroup2_1 = new Group("1課");
        Unit salesGroup2_2 = new Group("2課");
        salesDepartment2.add(salesGroup2_1);
        salesDepartment2.add(salesGroup2_2);

        Unit department = new Department("営業部");
        department.add(salesDepartment1);
        department.add(salesDepartment2);

        department.printList("");
    }
}
