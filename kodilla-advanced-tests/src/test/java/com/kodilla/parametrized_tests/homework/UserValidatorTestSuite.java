package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Zem", "WolK1", "True"})
    public void shouldReturnTrueOrFalseIfUsernameIsCorrectOrIncorrect(String input, Boolean expected) {
        assertFalse(expected);
    }
}