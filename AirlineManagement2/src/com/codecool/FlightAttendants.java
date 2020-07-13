package com.codecool;

import java.util.Date;

public class FlightAttendants extends Employee{

    Language language;

    public FlightAttendants(String name, Date dateOfBirthDay, Language language) {
        super(name, dateOfBirthDay);
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
