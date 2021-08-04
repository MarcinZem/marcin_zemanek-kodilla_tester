package com.kodilla.collections.interfaces.homework;

public class Seat implements Car{

    private int speed;

    public Seat(int speed) {
        this.speed = speed;
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

        return getSpeed() - 25;
    }

}
