package com.kodilla.good.patterns.practice.one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FoodDistributorTestSuite {
    @Test
    public void shouldReturnTrue() {
        //Given
        ProducerExtraFoodShop extra = new ProducerExtraFoodShop("extra", null);

        //When & Then
        Assertions.assertTrue(extra.process());
    }
}