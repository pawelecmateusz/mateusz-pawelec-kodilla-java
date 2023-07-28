package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithAllIngredients() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChickenDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new JalapenoPeppersDecorator(pizzaOrder);
        pizzaOrder = new TomatoDecorator(pizzaOrder);

        //When
        String expectedIngredients = "Tomato sauce" +
                "\nMozzarella" +
                "\nChicken" +
                "\nExtra Cheese" +
                "\nJalapeno Peppers" +
                "\nTomato";
        String actualIngredients = pizzaOrder.getIngredients();

        //Then
        assertEquals(expectedIngredients, actualIngredients);
    }

    @Test
    public void testPizzaWithTotalCost() {

        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChickenDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new JalapenoPeppersDecorator(pizzaOrder);
        pizzaOrder = new TomatoDecorator(pizzaOrder);

        //When
        BigDecimal expectedCost = new BigDecimal(23.00);
        BigDecimal totalCost = pizzaOrder.getCost();

        //Then
        assertEquals(expectedCost, totalCost);
    }
}