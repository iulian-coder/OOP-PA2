package com.codecool;
import java.util.concurrent.atomic.AtomicInteger;

public class Clothes {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int clothId;
    private String brandName;
    private ClothesType clothesType;

    public Clothes(String brandName, ClothesType clothesType) {
        this.clothId = count.incrementAndGet();
        this.brandName = brandName;
        this.clothesType = clothesType;
    }

    public int getClothId() {
        return clothId;
    }

    public void setClothId(int clothId) {
        this.clothId = clothId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public ClothesType getClothesType() {
        return clothesType;
    }

    public void setClothesType(ClothesType clothesType) {
        this.clothesType = clothesType;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "clothId=" + clothId +
                ", brandName='" + brandName + '\'' +
                ", clothesType=" + clothesType +
                '}';
    }
}
