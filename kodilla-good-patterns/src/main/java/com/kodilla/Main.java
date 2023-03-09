package com.kodilla;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String result = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getKey() + entry.getValue())
                .collect(Collectors.joining("!"));

        System.out.println(result);
    }
}