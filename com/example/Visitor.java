package com.example;

public interface Visitor {
    public void visit(Group group);

    public void visit(Department department);
}
