package com.kodilla.exception.test;

import java.util.Scanner;

public class FlightExceptionHandling {
    public static void main(String[] args) {
        Flight gdanskWarsaw = new Flight("Gdansk", "Warsaw");
        Flight gdanskWroclaw = new Flight("Gdansk", "Wroclaw");
        Flight warsawGdansk = new Flight("Warsaw", "Gdansk");
        Flight warsawWroclaw = new Flight("Warsaw", "Wroclaw");
        Flight wroclawGdansk = new Flight("Wroclaw", "Gdansk");
        Flight wroclawWarsaw = new Flight("Wroclaw", "Gdansk");
        FlightSearch flightSearch = new FlightSearch();
        Scanner sc = new Scanner(System.in);

        System.out.println("Search for flights\n");
        System.out.println("Airports we (usually) fly from/to are:");
        System.out.println("Gdansk, Warsaw, Wroclaw\n");

        while (true) {
            System.out.println("What's the departure airport?");
            String departure = sc.next();
            System.out.println("What's the arrival airport?");
            String arrival = sc.next();
            if (departure.equals("Gdansk") && arrival.equals("Warsaw")) {
                try {
                    flightSearch.findFlight(gdanskWarsaw);
                    System.out.println("\nRoute " + gdanskWarsaw.getDepartureAirport() + " - " + gdanskWarsaw.getArrivalAirport() + " is available.");
                } catch (RouteNotFoundException e) {
                    System.out.println("\nNo flights available for " + gdanskWarsaw.getDepartureAirport() + " - " + gdanskWarsaw.getArrivalAirport() + " at this moment.");
                } finally {
                    System.out.println("Search completed.");
                }
            } else if (departure.equals("Gdansk") && arrival.equals("Wroclaw")) {
                try {
                    flightSearch.findFlight(gdanskWroclaw);
                    System.out.println("\nRoute " + gdanskWroclaw.getDepartureAirport() + " - " + gdanskWroclaw.getArrivalAirport() + " is available.");
                } catch (RouteNotFoundException e) {
                    System.out.println("\nNo flights available for " + gdanskWroclaw.getDepartureAirport() + " - " + gdanskWroclaw.getArrivalAirport() + " at this moment.");
                } finally {
                    System.out.println("Search completed.");
                }
            } else if (departure.equals("Warsaw") && arrival.equals("Gdansk")) {
                try {
                    flightSearch.findFlight(warsawGdansk);
                    System.out.println("\nRoute " + warsawGdansk.getDepartureAirport() + " - " + warsawGdansk.getArrivalAirport() + " is available.");
                } catch (RouteNotFoundException e) {
                    System.out.println("\nNo flights available for " + warsawGdansk.getDepartureAirport() + " - " + warsawGdansk.getArrivalAirport() + " at this moment.");
                } finally {
                    System.out.println("Search completed.");
                }
            } else if (departure.equals("Warsaw") && arrival.equals("Wroclaw")) {
                try {
                    flightSearch.findFlight(warsawWroclaw);
                    System.out.println("\nRoute " + warsawWroclaw.getDepartureAirport() + " - " + warsawWroclaw.getArrivalAirport() + " is available.");
                } catch (RouteNotFoundException e) {
                    System.out.println("\nNo flights available for " + warsawWroclaw.getDepartureAirport() + " - " + warsawWroclaw.getArrivalAirport() + " at this moment.");
                } finally {
                    System.out.println("Search completed.");
                }
            } else if (departure.equals("Wroclaw") && arrival.equals("Gdansk")) {
                try {
                    flightSearch.findFlight(wroclawGdansk);
                    System.out.println("\nRoute " + wroclawGdansk.getDepartureAirport() + " - " + wroclawGdansk.getArrivalAirport() + " is available.");
                } catch (RouteNotFoundException e) {
                    System.out.println("\nNo flights available for " + wroclawGdansk.getDepartureAirport() + " - " + wroclawGdansk.getArrivalAirport() + " at this moment.");
                } finally {
                    System.out.println("Search completed.");
                }
            } else if (departure.equals("Wroclaw") && arrival.equals("Warsaw")) {
                try {
                    flightSearch.findFlight(wroclawWarsaw);
                    System.out.println("\nRoute " + wroclawWarsaw.getDepartureAirport() + " - " + wroclawWarsaw.getArrivalAirport() + " is available.");
                } catch (RouteNotFoundException e) {
                    System.out.println("\nNo flights available for " + wroclawWarsaw.getDepartureAirport() + " - " + wroclawWarsaw.getArrivalAirport() + " at this moment.");
                } finally {
                    System.out.println("Search completed.");
                }
            } else {
                System.out.println("No such airports, try again.");
            }
            System.out.println("\nAnother search?");
        }
    }
}