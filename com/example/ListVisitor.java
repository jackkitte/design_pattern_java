package com.example;

import java.util.Iterator;

public class ListVisitor implements Visitor {
    private String currentDepartment = "";

    @Override
    public void visit(Group group) {
        System.out.println(currentDepartment + "/" + group);
    }

    @Override
    public void visit(Department department) {
        System.out.println(currentDepartment + "/" + department);

        String saveDepartment = currentDepartment;

        currentDepartment = currentDepartment + "/" + department.getName();

        Iterator<Unit> it = department.iterator();

        while (it.hasNext()) {
            Unit unit = it.next();

            unit.accept(this);
        }

        currentDepartment = saveDepartment;
    }
}
