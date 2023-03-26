package com.kodilla.good.patterns.practice.two;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FlightServiceTest {

    private FlightService flightService;

    @BeforeEach
    public void setup() {
        flightService = new FlightService();
    }

    @DisplayName("Flight From")
    @Test
    public void shouldReturnAllFlightsFrom() {
        // when
        int size = flightService.findAllFrom("Gdansk").size();

        // then
        Assertions.assertEquals(5, size);
    }

    @DisplayName("Flight To")
    @Test
    public void shouldReturnAllFlightsTo() {
        // when
        int size = flightService.findAllTo("Krakow").size();

        // then
        Assertions.assertEquals(4, size);
    }

    @DisplayName("Test 1 of flights Via")
    @Test
    public void shouldReturnAllFlightsViaOne() {
        // when
        int size = flightService.findAllVia("Gdansk", "Krakow", "Wroclaw").size();

        // then
        Assertions.assertEquals(1, size);
    }

    @DisplayName("Test 2 of flights Via")
    @Test
    public void shouldReturnAllFlightsViaTwo() {
        // when
        int size = flightService.findAllVia("Krakow", "Katowice", "Gdansk").size();

        // then
        Assertions.assertEquals(1, size);
    }
}
