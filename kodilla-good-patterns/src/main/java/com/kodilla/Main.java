package com.kodilla;

import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String exclamation = "!";

        String result = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getKey() + entry.getValue())
                .collect(Collectors.joining(exclamation));

        System.out.println(result);
    }
}