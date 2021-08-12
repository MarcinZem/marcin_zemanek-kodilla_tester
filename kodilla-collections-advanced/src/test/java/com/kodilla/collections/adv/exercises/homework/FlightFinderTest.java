package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void testGetFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        String departure = "Warsaw";
        List<Flight> flights = flightFinder.findFlightsFrom(departure);
        assertEquals(3, flights.size());
    }
    @Test
    public void testGetFlightTo() {
        FlightFinder flightFinder = new FlightFinder();
        String arrival = "Krakow";
        List<Flight> flights = flightFinder.findFlightsTo(arrival);
        assertEquals(1, flights.size());
    }
}