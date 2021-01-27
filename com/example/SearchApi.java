package com.example;

import java.util.ArrayList;
import java.util.List;

public class SearchApi {
    private Strategy strategy;

    private static List<Employee> employeeList = new ArrayList<>();

    static {
        for (int i = 0; i < 10000; i++) {
            Employee employee = new Employee(i, "user" + i);
            employeeList.add(employee);
        }
    }

    public SearchApi(Strategy strategy) {
        super();
        this.strategy = strategy;
    }

    public Employee searchEmployee(int id) {
        Employee employee = strategy.search(employeeList, id);

        return employee;
    }
}
