package com.codecool;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Clothes clothes1 = new Clothes("Zara",ClothesType.BLOUSE);
        Clothes clothes2 = new Clothes("Strada",ClothesType.SHIRT);
        Clothes clothes3 = new Clothes("Nore",ClothesType.TROUSERS);
        Clothes clothes4 = new Clothes("Ewaer",ClothesType.SKIRT);

        SimpleHanger simpleHanger1 = new SimpleHanger();
        DoubleHanger doubleHanger1 = new DoubleHanger();

       Wardrobe wardrobe1 = Wardrobe.getInstance();

        System.out.println("Main");

        wardrobe1.addHanger(simpleHanger1);
        simpleHanger1.addClotheOnHanger(clothes1);

        wardrobe1.addHanger(doubleHanger1);
        doubleHanger1.addClotheOnHanger(clothes2);
        doubleHanger1.addClotheOnHanger(clothes3);

        for (Hanger hanger : wardrobe1.getHangerListInWardrobe()) {
            hanger.removeAllClotheFromHanger();
        }

        for (Hanger hanger : wardrobe1.getHangerListInWardrobe()) {
           hanger.checkSpaceForOneTypeOfClothes(ClothesType.SKIRT);
        }
    }
}
