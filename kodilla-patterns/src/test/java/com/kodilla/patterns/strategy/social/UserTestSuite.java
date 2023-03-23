package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millennials("john");
        //When
        String shareJohn = john.sharePost();
        System.out.println("Sharing on: " + shareJohn);
        //Then
        Assertions.assertEquals("Facebook", shareJohn);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millennials("john");
        //When
        String shareJohn = john.sharePost();
        System.out.println("Sharing on: " + shareJohn);
        john.setSharingStrategy(new TwitterPublisher());
        shareJohn = john.sharePost();
        System.out.println(john.getUsername() + " is now sharing on: " + shareJohn);
        //Then
        Assertions.assertEquals("Twitter", shareJohn);
    }
}