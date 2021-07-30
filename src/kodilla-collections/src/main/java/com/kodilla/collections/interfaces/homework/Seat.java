package com.kodilla.collections.interfaces.homework;

public class Seat implements Car{

    private int speed;

    public Seat(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return 3 * increaseSpeed() + 2 * decreaseSpeed();
    }

    @Override
    public int increaseSpeed() {

        return speed + 60;
    }

    @Override
    public int decreaseSpeed() {

        return speed - 25;
    }

    @Override
    public int doRace(VW vw) {
        return 0;
    }

    @Override
    public int doRace(Seat seat) {
        return 0;
    }

    @Override
    public int doRace(Skoda skoda) {
        return 0;
    }
}
