package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class SimpleHanger extends Hanger {

    private boolean full;
    private int spaceOnHanger;
    private List<Clothes> clothesListSimpleHanger = new ArrayList<>();

    public SimpleHanger() {
        super();
        this.spaceOnHanger = 1;
    }

    @Override
    public boolean isFull() {
        return full;
    }

    @Override
    public void setFull(boolean full) {
        this.full = full;
    }

    @Override
    public void checkSpaceOnHanger(int spaceOnHanger) {
        setFull(clothesListSimpleHanger.size() == spaceOnHanger);
    }

    @Override
    public boolean checkSpaceForOneTypeOfClothes(ClothesType clothesType) {
        checkSpaceOnHanger(spaceOnHanger);
        if(!isFull() && checkTypeOfClothesCompatibility(clothesType)){
            System.out.println("You can add " + clothesType + " on hanger " + hangerId);
            return true;
        }else {
            System.out.println("You can not add " + clothesType + " on hanger " + hangerId);
            return false;
        }
    }

    @Override
    public void addClotheOnHanger(Clothes clothes) {
        checkSpaceOnHanger(spaceOnHanger);
        if (!isFull() && checkTypeOfClothesCompatibility(clothes.getClothesType())) {
            clothesListSimpleHanger.add(clothes);
            System.out.println(clothes + "add");
        } else {
            System.out.println("The SimpleHanger is full/no compatible with " + clothes);
        }
    }



    @Override
    public void removeClotheFromHanger(Clothes clothes) {
        if (isFull() && clothesListSimpleHanger.contains(clothes)) {
            clothesListSimpleHanger.remove(clothes);
            System.out.println(clothes + "Remove");
        } else {
            System.out.println("No " + clothes + "on hanger" + hangerId);
        }
    }

    @Override
    public void removeAllClotheFromHanger() {
        clothesListSimpleHanger.clear();
        System.out.println("All clothes remove");
    }

    @Override
    public List<Clothes> getClothesList() {
        return clothesListSimpleHanger;
    }

    @Override
    public boolean checkTypeOfClothesCompatibility(ClothesType clothesType) {
//        can accommodate a single shirt or blouse only
            return clothesType.equals(ClothesType.BLOUSE) || clothesType.equals(ClothesType.SHIRT);
    }

    @Override
    public String toString() {
        return "SimpleHanger{" +
                "full=" + full +
                ", spaceOnHanger=" + spaceOnHanger +
                ", clothesListSimpleHanger=" + clothesListSimpleHanger +
                ", hangerId=" + hangerId +
                ", spaceOnHanger=" + spaceOnHanger +
                ", clothesList=" + clothesList +
                '}';
    }
}
