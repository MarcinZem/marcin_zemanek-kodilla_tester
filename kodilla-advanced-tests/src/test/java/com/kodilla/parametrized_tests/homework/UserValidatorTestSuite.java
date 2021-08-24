package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Zem", "volk1", "FireBlade298", "OGboy", "Player1"})
    public void shouldReturnTrueIfUsernameMatch(String text) {
        boolean result = validator.validateUsername(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"OG", "@#OHboi", "*&%6$", "Money$$$"})
    public void shouldReturnFalseIfUsernameDoesntMatch(String text) {
        boolean result = validator.validateUsername(text);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"zdichu@gmail.com", "Ogboi621@outlook.com", "qwerty981@op.pl"})
    public void shouldReturnTrueIfEmailMatch(String text) {
        boolean result = validator.validateEmail(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"@#$%@gmail.com", ")(qwerty@op.pl", "!@+=@outlook.com"})
    public void shouldReturnFalseIfEmailDoesntMatch(String text) {
        boolean result = validator.validateEmail(text);
        assertFalse(result);
    }
}