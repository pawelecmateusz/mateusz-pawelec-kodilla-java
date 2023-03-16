package com.kodilla.good.patterns.practiceOne;

import java.util.List;

public class ProducerExtraFoodShop implements FoodProducer {

    private final String producerName;
    private final String address;

    private List<Product> allProducts;

    public ProducerExtraFoodShop(String producerName, String address, List<Product> allProducts) {
        this.producerName = producerName;
        this.address = address;
        this.allProducts = allProducts;
    }

    @Override
    public String toString() {
        return "'" + producerName + "' from " + address;
    }

    @Override
    public boolean process(List<List<Product>> products, String productName, int quantity) {
        for (List<Product> all : products) {
            for (Product product : all) {
                if (all.equals(allProducts)) {
                    if (product.getName().equals(productName) && (product.getQuantity() >= quantity)) {
                        product.setQuantity(product.getQuantity() - quantity);
                        System.out.println("* " + producerName + " *");
                        System.out.println("You've bought " + quantity + " '" + product.getName() + "'");
                        System.out.println("We still have " + product.getQuantity() + " '" + product.getName() + "' left.");
                        return true;
                    } else if (product.getQuantity() < quantity) {
                        System.out.println("Sorry, we only have " + product.getQuantity() + " of '" + product.getName() + "'");
                        return false;
                    }
                }
            }
        }
        System.out.println("Sorry, but we don't have '" + productName + "' in " + producerName);
        return false;
    }
}