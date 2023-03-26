package com.kodilla.good.patterns.practice.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightRepository {

    private final List<Flight> flights = new ArrayList<>();

    public FlightRepository() {
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Gdansk", "Warsaw"));
        flights.add(new Flight("Gdansk", "Katowice"));
        flights.add(new Flight("Gdansk", "Wroclaw"));
        flights.add(new Flight("Gdansk", "Lodz"));
        flights.add(new Flight("Krakow", "Gdansk"));
        flights.add(new Flight("Krakow", "Wroclaw"));
        flights.add(new Flight("Warsaw", "Krakow"));
        flights.add(new Flight("Wroclaw", "Gdansk"));
        flights.add(new Flight("Wroclaw", "Krakow"));
        flights.add(new Flight("Lodz", "Krakow"));
    }

    public List<Flight> getAllFlights() {
        return Collections.unmodifiableList(flights);
    }
}