package com.elechen.spring.learn.car.child;

/**
 * Created by Incredile on 2016/11/20.
 */
public class BMW {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +'}';
    }

}
