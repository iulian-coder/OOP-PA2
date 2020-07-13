package com.codecool;


import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

abstract public class Hanger {
    private static final AtomicInteger count = new AtomicInteger(0);
    int hangerId;
    private int spaceOnHanger;
    private boolean full;
    List<Clothes> clothesList;


    public Hanger() {
        this.hangerId = count.incrementAndGet();
        System.out.println("Hanger created " + hangerId);
    }

    public int getSpaceOnHanger() {
        return spaceOnHanger;
    }

    public void setSpaceOnHanger(int spaceOnHanger) {
        this.spaceOnHanger = spaceOnHanger;
    }

    public int getHangerId() {
        return hangerId;
    }

    public void setHangerId(int hangerId) {
        this.hangerId = hangerId;
    }

    public abstract boolean isFull();

    public abstract void setFull(boolean full);

    public abstract List<Clothes> getClothesList();

    public abstract boolean checkTypeOfClothesCompatibility(ClothesType clothesType);

    public abstract void checkSpaceOnHanger(int spaceOnHanger);

    public abstract boolean checkSpaceForOneTypeOfClothes(ClothesType clothesType);

    public abstract void addClotheOnHanger(Clothes clothes);

    public abstract void removeClotheFromHanger(Clothes clothes);

    public abstract void removeAllClotheFromHanger();

}
