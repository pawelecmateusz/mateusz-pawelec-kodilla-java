package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<Continent> theWorld = new ArrayList<>();

    public void addContinent(Continent continent) {
        theWorld.add(continent);
    }
    public List<Continent> getContinent() {
        return theWorld;
    }
    public BigDecimal getPeopleQuantity() {
        return theWorld.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}