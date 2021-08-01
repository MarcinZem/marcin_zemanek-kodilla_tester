package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car {

    private int speed;

    public Skoda(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return 3 * increaseSpeed() + 2 * decreaseSpeed();
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

