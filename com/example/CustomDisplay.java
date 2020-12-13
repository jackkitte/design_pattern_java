package com.example;

import java.util.ArrayList;
import java.util.List;

public class CustomDisplay extends Display {
    public CustomDisplay(DbImpl impl) {
        super(impl);
    }

    public void filterAge(int age) {
        List<Employee> employeeList = getEmployeeList();

        for (Employee employee : employeeList) {
            if (employee.getAge() <= age) {
                System.out.println(employee);
            }
        }
    }
}
