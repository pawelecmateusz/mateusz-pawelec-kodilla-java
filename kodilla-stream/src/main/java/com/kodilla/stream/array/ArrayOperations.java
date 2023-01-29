package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        double allNumbers = IntStream.range(0, numbers.length)
                .count();
        double average = IntStream.range(0, numbers.length)
                .average()
                .getAsDouble();
        return average;
    }
}
