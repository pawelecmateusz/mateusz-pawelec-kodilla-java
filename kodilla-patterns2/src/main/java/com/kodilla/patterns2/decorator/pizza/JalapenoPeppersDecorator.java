package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class JalapenoPeppersDecorator extends AbstractPizzaOrder {

    public JalapenoPeppersDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "\nJalapeno Peppers";
    }
}