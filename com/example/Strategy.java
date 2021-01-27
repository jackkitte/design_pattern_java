package com.example;

import java.util.List;

public interface Strategy {
    public Employee search(List<Employee> employeeList, int id);
}
