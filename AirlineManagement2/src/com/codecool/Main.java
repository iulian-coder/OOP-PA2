package com.codecool;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        List<FlightAttendants> flightAttendantsList = new ArrayList<>();

        FlightAttendants flightAttendant1 = new FlightAttendants("Bela", new Date(2001, Calendar.DECEMBER, 11), Language.ENGLISH);
        FlightAttendants flightAttendant2 = new FlightAttendants("Duno", new Date(2002, Calendar.JUNE, 11), Language.ENGLISH);
        FlightAttendants flightAttendant3 = new FlightAttendants("Nelo", new Date(2003, Calendar.FEBRUARY, 11), Language.ENGLISH);

        flightAttendantsList.add(flightAttendant1);
        flightAttendantsList.add(flightAttendant2);
        flightAttendantsList.add(flightAttendant3);


        List<Pilots> pilotsList = new ArrayList<>();
        Pilots pilot1 = new Pilots("Morgan", new Date(1980, Calendar.FEBRUARY, 10), true, false);
        Pilots pilot2 = new Pilots("George", new Date(2000, Calendar.APRIL, 10), true, true);


        pilotsList.add(pilot1);
        pilotsList.add(pilot2);

        Flight flight1 = new Flight(Language.ENGLISH);

        flight1.checkToTakeOff(randomNumberOfPassengers(), flight1.getLanguage(), flightAttendantsList, pilotsList);

       
    }

    private static int randomNumberOfPassengers() {
        Random r = new Random();
        int low = 100;
        int high = 250;
        int result = r.nextInt(high - low) + low;
        return result;
    }
}
