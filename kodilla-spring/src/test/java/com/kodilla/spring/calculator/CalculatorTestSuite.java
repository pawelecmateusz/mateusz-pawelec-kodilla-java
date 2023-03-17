package com.kodilla.spring.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @DisplayName("Testing Addition")
    @Test
    public void testAdd() {
        //Given
        //When
        calculator.add(5.9, 4.2);
        //Then
        //do nothing
    }

    @DisplayName("Testing subtraction")
    @Test
    public void testSub() {
        //Given
        //When
        calculator.sub(6.3, 1.1);
        //Then
        //do nothing
    }

    @DisplayName("Testing multiplication")
    @Test
    public void testMul() {
        //Given
        //When
        calculator.mul(2.5, 2.5);
        //Then
        //do nothing
    }

    @DisplayName("Testing division")
    @Test
    public void testDiv() {
        //Given
        //When
        calculator.div(12.5, 2.3);
        //Then
        //do nothing
    }
}
