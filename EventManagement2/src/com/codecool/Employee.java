package com.codecool;

import java.util.concurrent.atomic.AtomicInteger;

abstract public class Employee {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int employeeId;

    public Employee() {
        this.employeeId = count.incrementAndGet();
        System.out.println("Object created " + employeeId);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
