package com.example;

import java.util.List;

public class Display {
    DbImpl impl;

    public Display(DbImpl impl) {
        super();
        this.impl = impl;
    }

    public List<Employee> getEmployeeList() {
        impl.connect();
        List<Employee> employeeList = impl.findAllEmployee();
        impl.close();

        return employeeList;
    }

    public void showEmployeeList() {
        List<Employee> employeeList = getEmployeeList();

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        System.out.println();
    }
}
