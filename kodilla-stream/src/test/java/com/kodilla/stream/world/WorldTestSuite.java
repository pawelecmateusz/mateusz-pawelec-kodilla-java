package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.world.Continent.europe;
import static com.kodilla.stream.world.Continent.northAmerica;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        List<List<Country>> continents = new ArrayList<>();
        continents.add(europe);
        continents.add(northAmerica);
        //When

        //Then
        BigDecimal expectedPopulation = new BigDecimal("1800000");
        assertEquals(expectedPopulation, totalPopulation);
    }
}
