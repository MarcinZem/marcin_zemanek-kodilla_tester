package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class BMISourcesTestSuite {

    private BMISources sources = new BMISources();

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.BMISources#provideStringForBMITesting")
    public void shouldCalculateBMI(String input, double expected) {
       // assertEquals(expected, sources.provideStringForBMITesting(input));
    }


}