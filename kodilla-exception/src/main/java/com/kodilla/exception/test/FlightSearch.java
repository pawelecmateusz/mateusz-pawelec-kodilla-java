package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Wroclaw", false);
        airports.put("Gdansk", true);

        if (airports.containsKey(flight.getArrivalAirport()) && airports.get(flight.getArrivalAirport())) {
            return true;
        } else {
            throw new RouteNotFoundException();
        }
    }
}