package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GamblingMachineTestSuite {

private GamblingMachine machine = new GamblingMachine();

@ParameterizedTest
@CsvFileSource(resources = "gamblingMachine.csv", numLinesToSkip = 1)
public void shouldWinInGamblingMachine(Integer input, String expected) throws InvalidNumbersException {
    assertEquals(expected, machine.howManyWins(Collections.singleton(input)));
}
}