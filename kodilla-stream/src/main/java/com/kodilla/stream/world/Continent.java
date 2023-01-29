package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
public class Continent {

    private final List<Country> europe = new ArrayList<>();

    public void addCountry(Country country) {
        europe.add(country);
    }
    public List<Country> getCountries() {
        return europe;
    }
}