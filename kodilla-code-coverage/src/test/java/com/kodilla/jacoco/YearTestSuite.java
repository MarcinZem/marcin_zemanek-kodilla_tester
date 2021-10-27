package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTestSuite {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldntBeLeapYearDivisibleBy400() {
        Year year = new Year(100);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }
    @Test
    public void shouldntBeLeapYearIfDivisibleBy100() {
        Year year = new Year(80);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }
    @Test
    public void shouldntBeLeapYearIfDivisibleBy4() {
        Year year = new Year(2);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }
}

