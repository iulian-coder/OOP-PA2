package com.codecool;

public enum EventType {

//    Event Cocktail - 5 hours - eventDuration 300 minutes - workTimeInterval 5
//    Event Wedding - 8 hours - eventDuration 480 minutes - workTimeInterval 10
//    Event Conferences - 10 hours - eventDuration 600 minutes - workTimeInterval

    COCKTAIL(300, 5),
    WEDDINGS(480, 10),
    CONFERENCES(600, 10);

    private final int eventDuration;
    private final int workTimeInterval;

    EventType(int eventDuration, int workTimeInterval) {
        this.eventDuration = eventDuration;
        this.workTimeInterval = workTimeInterval;
    }

    public int getEventDuration() {
        return eventDuration;
    }

    public int getWorkTimeInterval() {
        return workTimeInterval;
    }
}
