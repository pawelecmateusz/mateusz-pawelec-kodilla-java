package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;
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
        try {
            secondChallenge.probablyIWillThrowException(x, y);
            System.out.println("Correct");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
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
        try {
            secondChallenge.probablyIWillThrowException(x, y);
            System.out.println("Correct");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
        //then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x, y))
        );
    }
}
