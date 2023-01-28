package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.world.Continent.europe;
import static com.kodilla.stream.world.Continent.northAmerica;

public final class World {

    private final List<List<Country>> theWorld = new ArrayList<>();
    public BigDecimal getPeopleQuantity() {
        return theWorld.stream()
                .flatMap(continents -> continents.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}