package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    double add(double a, double b) {
        double value = a + b;
        display.display(value);
        return value;
    }

    double subtract(double a, double b) {
        double value = a - b;
        display.display(value);
        return value;
    }

    double multiply(double a, double b) {
        double value = a * b;
        display.display(value);
        return value;
    }

    double divide(double a, double b) {
        double value = a / b;
        display.display(value);
        return value;
    }
}
