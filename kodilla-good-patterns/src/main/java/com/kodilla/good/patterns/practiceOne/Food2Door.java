package com.kodilla.good.patterns.practiceOne;

import java.util.ArrayList;
import java.util.List;

public class Food2Door {
    final List<FoodProducer> foodProducers;
    final List<List<Product>> food2DoorAllProducts;

    public Food2Door() {
        List<Product> extraFoodShopProducts = new ArrayList<>();
        extraFoodShopProducts.add(new Product("Bread", 20));
        extraFoodShopProducts.add(new Product("Muffins", 50));
        extraFoodShopProducts.add(new Product("Apple pie", 8));
        extraFoodShopProducts.add(new Product("Rolls", 25));

        List<Product> glutenFreeShopProducts = new ArrayList<>();
        glutenFreeShopProducts.add(new Product("Oat flakes", 30));
        glutenFreeShopProducts.add(new Product("Corn flour", 20));
        glutenFreeShopProducts.add(new Product("Yogurt", 25));

        List<Product> healthyShopProducts = new ArrayList<>();
        healthyShopProducts.add(new Product("Vegetables mix", 20));
        healthyShopProducts.add(new Product("Fresh tomatoes", 100));
        healthyShopProducts.add(new Product("Baby carrots", 35));

        food2DoorAllProducts = new ArrayList<>();
        food2DoorAllProducts.add(extraFoodShopProducts);
        food2DoorAllProducts.add(glutenFreeShopProducts);
        food2DoorAllProducts.add(healthyShopProducts);

        foodProducers = new ArrayList<>();
        foodProducers.add(new ProducerExtraFoodShop("Extra Food Shop", "Warsaw", extraFoodShopProducts));
        foodProducers.add(new ProducerGlutenFreeShop("Gluten Free Shop", "Wroclaw", glutenFreeShopProducts));
        foodProducers.add(new ProducerHealthyShop("Healthy Shop", "Gdansk", healthyShopProducts));

    }
    public void showProducts(List<List<Product>> products) {
        for (List<Product> productList : products) {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
}