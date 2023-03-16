package com.kodilla.good.patterns.practiceOne;

import java.util.List;

public interface FoodProducer {

    boolean process(List<List<Product>> products, String productName, int quantity);
}