package com.kodilla.good.patterns.practice.two;

import java.util.Objects;

public class Airport {
    private String name;

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}