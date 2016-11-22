package com.elechen.spring.learn.car.child;

/**
 * Created by Incredile on 2016/11/20.
 */
public class Audi {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "brand='" + brand + '\'' +
                '}';
    }

}
