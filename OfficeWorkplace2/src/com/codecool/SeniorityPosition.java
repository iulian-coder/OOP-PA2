package com.codecool;

public enum SeniorityPosition {

    JUNIOR(1250),
    SENIOR(1700);

    private int salary;

    SeniorityPosition(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
