package com.codecool;

import java.util.Date;

public abstract class Employee {
    private String name;
    private Date dateOfBirthDay;

    public Employee(String name, Date dateOfBirthDay) {
        this.name = name;
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(Date dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateOfBirthDay=" + dateOfBirthDay +
                '}';
    }
}
