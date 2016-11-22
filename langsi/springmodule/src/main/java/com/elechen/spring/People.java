package com.elechen.spring;

/**
 * Created by Incredile on 2016/11/19.
 */
public class People {
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void play(){
        animal.sound();
    }
}
