package com.kodilla.exception.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.Exception;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test Exceptions")
public class SecondChallangeTestSuite {
    @DisplayName("Exception")
    @Test
    void probablyIWillThrowException() throws Exception {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when
        double x = 2;
        double y = 1.5;
        //then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y))
        );
    }
    @DisplayName("No Exception")
    @Test
    void probablyIWillNotThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when
        double x = 1.99;
        double y = 1.49;
        //then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x, y))
        );
    }
}