package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("300000"));
        Country france = new Country("France", new BigDecimal("300000"));

        Continent europe = new Continent();
        europe.addCountry(poland);
        europe.addCountry(france);

        World world = new World();
        world.addContinent(europe);

        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("600000");

        //Then
        assertEquals(expectedPopulation, totalPopulation);
    }
}