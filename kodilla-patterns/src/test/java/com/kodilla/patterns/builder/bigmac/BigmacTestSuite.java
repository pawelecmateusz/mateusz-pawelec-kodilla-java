package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @DisplayName("New Bigmac #1")
    @Test
    void testNewBigmac1() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Onion")
                .ingredient("Pickles")
                .ingredient("Shrimp")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals("Sesame", bigmac.getBun());
        Assertions.assertEquals(2, bigmac.getBurgers());
        Assertions.assertEquals(3, howManyIngredients);
    }
    @DisplayName("New Bigmac #2")

    @Test
    void testNewBigmac2() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("No sesame")
                .burgers(3)
                .sauce("Standard")
                .ingredient("Lettuce")
                .ingredient("Onion")
                .ingredient("Beckon")
                .ingredient("Pickles")
                .ingredient("Peppers")
                .ingredient("Champignons")
                .ingredient("Shrimp")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(3, bigmac.getBurgers());
        Assertions.assertEquals("Standard", bigmac.getSauce());
        Assertions.assertEquals(7, howManyIngredients);
        Assertions.assertEquals("Pickles", bigmac.getIngredients().get(3));

    }
}