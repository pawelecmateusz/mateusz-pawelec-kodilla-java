package com.kodilla.good.patterns.practice.one;

public class Application {
    public static void main(String[] args) {
        FoodProducer foodProducer = new ProducerExtraFoodShop("Extra Food Shop", null);
        foodProducer.process();

        foodProducer = new ProducerGlutenFreeShop("Gluten Free Shop", null);
        foodProducer.process();

        foodProducer = new ProducerHealthyShop("Healthy Shop", null);
        foodProducer.process();
    }
}