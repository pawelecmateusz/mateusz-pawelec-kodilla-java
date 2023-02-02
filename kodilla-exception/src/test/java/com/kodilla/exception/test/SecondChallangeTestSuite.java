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
    @DisplayName("Exception (The correct one?)")
    @Test
    void probablyIWillNotThrowExceptionOne() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when&then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 2.1))
        );
    }
}
