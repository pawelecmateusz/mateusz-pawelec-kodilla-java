package com.kodilla.good.patterns.practiceOne;

public class Application {
    public static void main(String[] args) {
        Food2Door food2Door = new Food2Door();

        System.out.println("Our Suppliers:");
        for (FoodProducer producer : food2Door.foodProducers) {
            System.out.println(producer);
        }
        System.out.println(" ");

        System.out.println("Products available in our store:");
        food2Door.showProducts(food2Door.food2DoorAllProducts);

        System.out.println(" ");
        food2Door.foodProducers.get(0).process(food2Door.food2DoorAllProducts, "Muffins", 5);
        food2Door.foodProducers.get(0).process(food2Door.food2DoorAllProducts, "Apple pie", 10);
        System.out.println(" ");
        food2Door.foodProducers.get(1).process(food2Door.food2DoorAllProducts, "Yogurt", 3);
        food2Door.foodProducers.get(1).process(food2Door.food2DoorAllProducts, "Rolls", 8);
        System.out.println(" ");
        food2Door.foodProducers.get(2).process(food2Door.food2DoorAllProducts, "Baby carrots", 10);
        food2Door.foodProducers.get(2).process(food2Door.food2DoorAllProducts, "Orange juice", 4);
    }
}