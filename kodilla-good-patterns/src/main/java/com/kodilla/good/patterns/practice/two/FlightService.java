package com.kodilla.good.patterns.practice.two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    FlightRepository flightRepository = new FlightRepository();

    public List<Flight> findAllFrom(String from) {
        return flightRepository.getAllFlights().stream()
                .filter(flight -> flight.getFrom().equals(from))
                .collect(Collectors.toList());
    }

    public List<Flight> findAllTo(String to) {
        return flightRepository.getAllFlights().stream()
                .filter(flight -> flight.getTo().equals(to))
                .collect(Collectors.toList());
    }

    public List<Flight> findAllVia(String from, String to, String via) {
        List<Flight> viaFlights = new ArrayList<>();

        List<Flight> flightFrom = flightRepository.getAllFlights().stream()
                .filter(flight -> flight.getFrom().equals(from))
                .filter(flight -> flight.getTo().equals(via))
                .toList();

        List<Flight> flightTo = flightRepository.getAllFlights().stream()
                .filter(flight -> flight.getFrom().equals(via))
                .filter(flight -> flight.getTo().equals(to))
                .toList();

        for (Flight departure : flightFrom) {
            for (Flight arrival : flightTo) {
                viaFlights.add(new Flight(departure.getFrom(), arrival.getTo()));
            }
        }
        return viaFlights;
    }
}