package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static com.kodilla.stream.array.ArrayOperations.getAverage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;
        numbers[3] = 1;
        numbers[4] = 1;
        numbers[5] = 1;
        numbers[6] = 1;
        numbers[7] = 1;
        numbers[8] = 1;
        numbers[9] = 1;
        numbers[10] = 1;
        numbers[11] = 1;
        numbers[12] = 1;
        numbers[13] = 1;
        numbers[14] = 1;
        numbers[15] = 1;
        numbers[16] = 1;
        numbers[17] = 1;
        numbers[18] = 1;
        numbers[19] = 1;
        //When
        double actual = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(1, actual);
    }
}

