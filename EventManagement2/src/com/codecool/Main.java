package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Helpers> helpersList = new ArrayList<>();

//        Create 10 helpers
        for (int i = 0; i < 10; i++) {
            helpersList.add(new Helpers());
        }

        int numberOfHelpers = helpersList.size();

        Managers managers1 = new Managers();
        Managers managers2 = new Managers();
        Managers managers3 = new Managers();

//        The latter is the chief organizer
        managers3.setChief(true);

        boolean eventCanStart = managers3.checkEventCanStart(numberOfHelpers);

        if (eventCanStart) {
            testEvents(helpersList, EventType.COCKTAIL,EventType.COCKTAIL.getEventDuration(),EventType.COCKTAIL.getWorkTimeInterval());
            testEvents(helpersList, EventType.WEDDINGS,EventType.WEDDINGS.getEventDuration(),EventType.WEDDINGS.getWorkTimeInterval());
            testEvents(helpersList, EventType.CONFERENCES,EventType.CONFERENCES.getEventDuration(),EventType.CONFERENCES.getWorkTimeInterval());
        }


    }

    private static void testEvents(List<Helpers> helpersList, EventType eventType, int eventDuration, int workTimeInterval) {
        for (int timeLap = 0; timeLap < eventDuration; timeLap++) {
            System.out.println("Time spent since start of the event " + timeLap);
            if (timeLap % workTimeInterval == 0) {
                for (Helpers helpers : helpersList) {
                    helpers.actionAccordingToEvent(eventType,workTimeInterval);
                }
            }
        }
        System.out.println(eventType+" is over");
    }
}
