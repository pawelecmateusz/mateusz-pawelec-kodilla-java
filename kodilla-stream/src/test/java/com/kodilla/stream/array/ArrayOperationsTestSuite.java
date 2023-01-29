package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        //When
        OptionalDouble expected = OptionalDouble.of(9.5);
        //Then
        assertEquals(expected, ArrayOperations.getAverage(numbers));
    }
}