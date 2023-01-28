package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.world.Continent.europe;
import static com.kodilla.stream.world.Continent.northAmerica;

public final class World {

    private final List<List<Country>> continents = new ArrayList<>();
    public World() {
        continents.add(europe);
        continents.add(northAmerica);
    }
    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(countries -> countries.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}