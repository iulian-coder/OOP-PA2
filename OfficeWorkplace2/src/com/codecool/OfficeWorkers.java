package com.codecool;

public class OfficeWorkers extends Employee {

    SeniorityPosition seniorityPosition;

    public OfficeWorkers(String name, Group group, SeniorityPosition seniorityPosition) {
        super(name, group);
        this.seniorityPosition = seniorityPosition;
        calculateSalary();
    }

    public SeniorityPosition getSeniorityPosition() {
        return seniorityPosition;
    }

    public void setSeniorityPosition(SeniorityPosition seniorityPosition) {
        this.seniorityPosition = seniorityPosition;
    }

    @Override
    public void calculateSalary() {
        this.salary = getSeniorityPosition().getSalary();
    }
}
