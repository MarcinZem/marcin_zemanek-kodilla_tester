package com.kodilla.collections.interfaces.homework;

public class CarRace {
    private static int getSpeed;

    public static void main(String[] args) {

        VW vw = new VW(0);
        Seat seat = new Seat(0);
        Skoda skoda = new Skoda(0);
        doRace(vw);
        doRace(seat);
        doRace(skoda);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
        }
}


