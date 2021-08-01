package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        VW vw = new VW(0);
        doRace(vw);
        Seat seat = new Seat(0);
        doRace(seat);
        Skoda skoda = new Skoda(0);
        doRace(skoda);
    }

    private static void doRace(VW vw) {
        System.out.println(vw.getSpeed());
    }
    private static void doRace(Seat seat) {
        System.out.println(seat.getSpeed());
    }
    private static void doRace(Skoda skoda) { System.out.println(skoda.getSpeed());
    }

}
