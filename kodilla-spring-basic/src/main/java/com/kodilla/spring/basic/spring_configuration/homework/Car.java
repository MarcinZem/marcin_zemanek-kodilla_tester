package com.kodilla.spring.basic.spring_configuration.homework;

public interface Car {

     static boolean hasHeadlightsTurnedOn(String on, String lights) {
        if (lights == on) {
            return true;
        } else {
            return false;
        }
    }
    String getCarType();
}
