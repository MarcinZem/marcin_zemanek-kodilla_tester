package com.kodilla.collections.interfaces.homework;

public class VW implements Car {

    private int speed;

    public VW(int speed) {
        this.speed = getSpeed();
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {

        return speed + 40;
    }

    @Override
    public int decreaseSpeed() {

        return speed - 30;
    }

}

