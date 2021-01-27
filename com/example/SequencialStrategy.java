package com.example;

import java.util.List;

public class SequencialStrategy implements Strategy {
    @Override
    public Employee search(List<Employee> employeeList, int id) {
        Employee result = null;

        long startTime = System.nanoTime();

        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                result = employee;
                break;
            }
        }

        long endTime = System.nanoTime();

        System.out.println("線形探索の処理時間：" + (endTime - startTime) + "ナノ秒");

        return result;
    }
}
