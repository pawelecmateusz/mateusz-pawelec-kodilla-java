package com.kodilla.stream.world;
import java.util.ArrayList;
import java.util.List;
public final class Continent {

    static final List<Country> europe = new ArrayList<>();
    static final List<Country> northAmerica = new ArrayList<>();

    public Continent() {
        europe.add(Country.poland);
        europe.add(Country.france);
        northAmerica.add(Country.canada);
        northAmerica.add(Country.usa);
    }
}
