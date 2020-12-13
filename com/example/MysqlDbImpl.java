package com.example;

import java.util.ArrayList;
import java.util.List;

public class MysqlDbImpl extends DbImpl {
    @Override
    public void connect() {
        System.out.println("MySQLに接続しました");
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();

        Employee yamada = new Employee("山田", 30);
        employeeList.add(yamada);
        Employee tanaka = new Employee("田中", 23);
        employeeList.add(tanaka);

        return employeeList;
    }

    @Override
    public void close() {
        System.out.println("MySQLとの接続をクローズしました");
    }
}
