package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class DoubleHanger extends Hanger {
    private boolean full;
    private int spaceOnHanger;

    private List<Clothes> clothesListDoubleHanger = new ArrayList<>();

    public DoubleHanger() {
        super();
        this.spaceOnHanger = 2;
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
        setFull(clothesListDoubleHanger.size() == spaceOnHanger);
    }

    @Override
    public boolean checkSpaceForOneTypeOfClothes(ClothesType clothesType) {
        checkSpaceOnHanger(spaceOnHanger);
        if(!isFull() & !checkTypeOfClothesCompatibility(clothesType)){
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
        if (!isFull() && !checkTypeOfClothesCompatibility(clothes.getClothesType())) {
            clothesListDoubleHanger.add(clothes);
            System.out.println(clothes + "add");
        } else {
            System.out.println(clothes + "fail");
        }
    }

    @Override
    public boolean checkTypeOfClothesCompatibility(ClothesType clothesType) {
        //it checks if it is already on the hanger
        boolean result = false;
        for (Clothes clothes1 : clothesListDoubleHanger) {
            if (clothes1.getClothesType().equals(clothesType)) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public void removeClotheFromHanger(Clothes clothes) {
        if (isFull() && clothesListDoubleHanger.contains(clothes)) {
            clothesListDoubleHanger.remove(clothes);
            System.out.println(clothes + "remove");
        } else {
            System.out.println("No " + clothes + "on hanger" + hangerId);
        }

    }

    @Override
    public void removeAllClotheFromHanger() {
        clothesListDoubleHanger.clear();
        System.out.println("All clothes remove");
    }


    @Override
    public List<Clothes> getClothesList() {
        return clothesListDoubleHanger;
    }



    @Override
    public String toString() {
        return "DoubleHanger{" +
                "full=" + full +
                ", spaceOnHanger=" + spaceOnHanger +
                ", clothesListDoubleHanger=" + clothesListDoubleHanger +
                ", hangerId=" + hangerId +
                ", spaceOnHanger=" + spaceOnHanger +
                ", clothesList=" + clothesList +
                '}';
    }
}
