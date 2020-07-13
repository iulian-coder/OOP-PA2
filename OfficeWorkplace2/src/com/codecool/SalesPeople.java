package com.codecool;

import java.util.Random;

public class SalesPeople extends Employee {


    public SalesPeople(String name, Group group) {
        super(name, group);
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        this.salary = commissionSalary();
    }

    private int commissionSalary() {
        Random r = new Random();
        int low = 1500;
        int high = 2000;
        return r.nextInt(high - low) + low;
    }
}
