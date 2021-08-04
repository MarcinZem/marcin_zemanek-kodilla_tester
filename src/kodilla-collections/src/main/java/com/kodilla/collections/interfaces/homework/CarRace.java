package com.kodilla.collections.interfaces.homework;

public class CarRace {
    private static int getSpeed;

    public static void main(String[] args) {

        VW vw = new VW(0);
        doRace(vw, getSpeed);
        Seat seat = new Seat(0);
        doRace(seat, getSpeed);
        Skoda skoda = new Skoda(0);
        doRace(skoda, getSpeed);
    }

    private static void doRace(Car car, int getSpeed) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(getSpeed);
    }

}
