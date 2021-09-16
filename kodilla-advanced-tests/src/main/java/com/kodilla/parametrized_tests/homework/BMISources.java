package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISources {

    static Stream<Arguments> provideStringForBMITesting() {
        return Stream.of(
                Arguments.of("Very severely underweight", 2.0, 50),
                Arguments.of("Severely underweight", 1.95, 60),
                Arguments.of("Underweight", 1.8, 55),
                Arguments.of("Normal (healthy weight)", 1.8, 70),
                Arguments.of("Overweight", 1.8, 95),
                Arguments.of("Obese Class I (Moderately obese)", 1.8, 100),
                Arguments.of("Obese Class II (Severely obese)", 1.8, 120),
                Arguments.of("Obese Class III (Very severely obese)", 1.8, 130),
                Arguments.of("Obese Class IV (Morbidly Obese)", 1.8, 150)
        );
    }
}
