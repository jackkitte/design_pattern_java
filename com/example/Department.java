package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department extends Unit {
    private String name;

    private List<Unit> unitList = new ArrayList<>();

    public Department(String name) {
        super();
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    protected Unit add(Unit unit) {
        unitList.add(unit);

        return this;
    }

    @Override
    public Iterator<Unit> iterator() {
        return unitList.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
