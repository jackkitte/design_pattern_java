package com.example;

import java.util.List;

public abstract class DbImpl {
    public abstract void connect();

    public abstract List<Employee> findAllEmployee();

    public abstract void close();
}
