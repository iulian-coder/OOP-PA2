package com.codecool;

import java.util.concurrent.atomic.AtomicInteger;

public class Managers extends Employee {
    private boolean chief;

    public Managers() {
        super();
    }

    public boolean isChief() {
        return chief;
    }

    public void setChief(boolean chief) {
        this.chief = chief;
    }

    public boolean checkEventCanStart(int numberOfHelpers) {
        if (numberOfHelpers == 10 && isChief()) {
            System.out.println("The event can start");
            return true;
        } else {
            System.out.println("The event needs 10 Helpers and Chief" + "\n" + "Found:" + "\n"
                    + numberOfHelpers + " helpers " + "\n"
                    + isChief() + " chief");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Managers{" +

                ", chief=" + chief +
                '}';
    }
}
