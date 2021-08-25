package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISources {

    static Stream<Arguments> provideStringForBMITesting() {
        return Stream.of(
                Arguments.of("Very severely underweight", 16),
        Arguments.of("Severely underweight", 18.5),
                Arguments.of("Underweight", 25),
                Arguments.of("Normal (healthy weight)", 30),
                Arguments.of("Overweight", 35),
                Arguments.of("Obese Class I (Moderately obese)", 40),
                Arguments.of("Obese Class II (Severely obese)", 45),
                Arguments.of("Obese Class III (Very severely obese)", 50),
                Arguments.of("Obese Class IV (Morbidly Obese)", 60)
        );
    }
}
