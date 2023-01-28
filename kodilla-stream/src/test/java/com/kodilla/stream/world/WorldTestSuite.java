package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        List<Country> europe = new ArrayList<>();
        europe.add(new Country("Poland", new BigDecimal("300000")));
        List<Country> northAmerica = new ArrayList<>();
        northAmerica.add(new Country("Canada", new BigDecimal("200000")));
        List<List<Country>> continents = new ArrayList<>();
        continents.add(europe);
        continents.add(northAmerica);
        //When
        World world = new World();
        BigDecimal totalPopulation = world.getPeopleQuantity());
        //Then
        BigDecimal expectedPopulation = new BigDecimal("500000");
        assertEquals(expectedPopulation, totalPopulation);
    }
}
