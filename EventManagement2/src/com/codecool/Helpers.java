package com.codecool;

import java.util.concurrent.atomic.AtomicInteger;

public class Helpers extends Employee {
    private boolean smoke;
    private boolean drinkCoffee;
    private boolean breakTime;
    private int timeSpentAtTheEvent;
    private int infoConferenceCounter = 1;

    public Helpers() {
        super();
    }


    public void actionAccordingToEvent(EventType eventType, int workTimeInterval) {
        switch (eventType) {
            case COCKTAIL -> {
                checkBreakTime(workTimeInterval);
                if (!isBreakTime()) {
                    System.out.println("Do you want a Cocktail?");
                }
            }
            case WEDDINGS -> {
                checkBreakTime(workTimeInterval);
                if (!isBreakTime()) {
                    System.out.println("Do you want wedding cake?");
                }
            }
            case CONFERENCES -> {
                checkBreakTime(workTimeInterval);
                if (!isBreakTime() && infoConferenceCounter == 1) {
                    System.out.println("In that direction are the snacks ");
                    infoConferenceCounter -= 1;
                }
            }
        }
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }

    public boolean isDrinkCoffee() {
        return drinkCoffee;
    }

    public void setDrinkCoffee(boolean drinkCoffee) {
        this.drinkCoffee = drinkCoffee;
    }

    public boolean isBreakTime() {
        return breakTime;
    }

    public void setBreakTime(boolean breakTime) {
        setSmoke(breakTime);
        setDrinkCoffee(breakTime);
        this.breakTime = breakTime;
    }

    public void checkBreakTime(int workTimeInterval) {
        timeSpentAtTheEvent += workTimeInterval;
        if (timeSpentAtTheEvent == 120) {
            setBreakTime(true);
            timeSpentAtTheEvent = 0;
            System.out.println("Break Time");
        }
        int breakTimeAllowed = 10;
        if (isBreakTime() && timeSpentAtTheEvent == breakTimeAllowed) {
            setBreakTime(false);
        }

    }

    @Override
    public String toString() {
        return "Helpers{" +

                ", smoke=" + smoke +
                ", drinkCoffee=" + drinkCoffee +
                '}';
    }
}
