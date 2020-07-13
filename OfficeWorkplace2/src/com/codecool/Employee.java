package com.codecool;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Employee {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int employeeId;
    String name;
    int salary;
    Group group;

    public Employee(String name, Group group) {
        this.employeeId = count.incrementAndGet();
        this.name = name;
        this.group = group;
        System.out.println("Object employee created " + employeeId);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public abstract void calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", group=" + group +
                '}';
    }
}
