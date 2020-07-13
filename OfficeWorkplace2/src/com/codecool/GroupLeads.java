package com.codecool;

public class GroupLeads extends Employee {

    private int numberOfEmployeeAssigned;

    public GroupLeads(String name, Group group, int numberOfEmployeeAssigned ) {
        super(name, group);
        this.numberOfEmployeeAssigned = numberOfEmployeeAssigned;
        calculateSalary();
    }


    public int getNumberOfEmployeeAssigned() {
        return numberOfEmployeeAssigned;
    }

    public void setNumberOfEmployeeAssigned(int numberOfEmployeeAssigned) {
        this.numberOfEmployeeAssigned = numberOfEmployeeAssigned;
    }

    @Override
    public void calculateSalary() {
        int baseSalary = 1800;
        this.salary = (getNumberOfEmployeeAssigned()*200)+baseSalary;
    }
}
