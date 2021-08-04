package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car {

    private int speed;

    public Skoda(int speed) {
        this.speed = getSpeed();
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {

        return speed + 30;
    }

    @Override
    public int decreaseSpeed() {

        return speed - 20;
    }
}

