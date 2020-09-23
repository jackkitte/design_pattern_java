package com.example;

public class Employee {
    private String name;
    private int age;
    private String departmentName;

    public Employee(String name, int age, String departmentName) {
        super();
        this.name = name;
        this.age = age;
        this.departmentName = departmentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
