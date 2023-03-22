package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        logger = Logger.INSTANCE;
        //When
        logger.log("LOGGER");
        //Then
        Assertions.assertEquals("LOGGER", logger.getLastLog());
    }
}