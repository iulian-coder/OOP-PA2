package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private int maxNumberOfHangers= 5;
    private static Wardrobe instance;
    private List<Hanger> hangerListInWardrobe = new ArrayList<>();

    public Wardrobe() {
        System.out.println("Wardrobe created");
    }
    public static Wardrobe getInstance(){
        if(instance == null){
            instance = new Wardrobe();
        }
        return instance;
    }

    public int getMaxNumberOfHangers() {
        return maxNumberOfHangers;
    }

    public void setMaxNumberOfHangers(int maxNumberOfHangers) {
        this.maxNumberOfHangers = maxNumberOfHangers;
    }

    public void addHanger(Hanger hanger) {

        if (getHangerListInWardrobe().size() <= maxNumberOfHangers) {
            getHangerListInWardrobe().add(hanger);
        }else {
            System.out.println("Wardrobe full - no space for " +hanger);
        }

    }

    public List<Hanger> getHangerListInWardrobe() {
        return hangerListInWardrobe;
    }

    public void setHangerListInWardrobe(List<Hanger> hangerListInWardrobe) {
        this.hangerListInWardrobe = hangerListInWardrobe;
    }
}
