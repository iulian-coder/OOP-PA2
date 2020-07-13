package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Flight {
    private final static AtomicInteger count = new AtomicInteger(0);
    private int flightId;
    Language language;

    public Flight(Language language) {
        this.flightId = count.incrementAndGet();
        this.language = language;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void checkToTakeOff(int numberOfPassengers, Language language, List<FlightAttendants> flightAttendantsList, List<Pilots> pilotsList) {
        int countTests = 3;

        System.out.println("Check the passengers");

        if (numberOfPassengers < 220) {
            System.out.println("Passengers passed");

        } else {
            System.out.println("Passengers failed reason " + numberOfPassengers + " overbooking");
            countTests -= 1;
        }

        System.out.println("Check attendants, " + "flight language is " + language);

        for (FlightAttendants flightAttendant : flightAttendantsList) {
            if (flightAttendant.getLanguage().equals(language)) {
                System.out.println(flightAttendant.getName() + " Pass");
            } else {
                System.out.println(flightAttendant.getName() + " Failed");
                countTests -= 1;
            }
        }

        System.out.println("Check pilots compass");

        for (Pilots pilot : pilotsList) {
            if (pilot.isCompass()) {
                System.out.println(pilot.getName() + " Pass");
            } else {
                System.out.println(pilot.getName() + " Failed");
                countTests -= 1;
            }
        }

        System.out.println("Results");
        System.out.println("Tests 3 " + "Pass " + countTests);

    }
}
