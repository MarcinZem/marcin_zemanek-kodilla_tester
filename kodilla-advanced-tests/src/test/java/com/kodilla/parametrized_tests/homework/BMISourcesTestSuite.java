package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BMISourcesTestSuite {

    private BMISources sources = new BMISources();

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BMISources#provideStringForBMITesting")
    public void shouldCalculateBMI(String expected, double height, double weight) {
        Person person = new Person(height, weight);
        assertEquals(expected, person.getBMI());

    }


}