package com.codecool;

import java.util.Date;

public class Pilots extends Employee {

    private boolean compass;
    private boolean captain;


    public Pilots(String name, Date dateOfBirthDay, Boolean compass, Boolean captain) {
        super(name, dateOfBirthDay);

        this.compass = compass;
        this.captain = captain;
    }

    public boolean isCompass() {
        return compass;
    }

    public void setCompass(boolean compass) {
        this.compass = compass;
    }

    public boolean isCaptain() {
        return captain;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

}
