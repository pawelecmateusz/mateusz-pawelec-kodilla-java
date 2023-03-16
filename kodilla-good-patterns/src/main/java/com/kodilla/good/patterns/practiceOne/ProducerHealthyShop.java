package com.kodilla.good.patterns.practiceOne;

import java.util.List;

public class ProducerHealthyShop implements FoodProducer {

    private String producerName;
    private String address;
    private List<Product> allProducts;

    public ProducerHealthyShop(String producerName, String address, List<Product> allProducts) {
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
                        System.out.println("Thank you for buying " + quantity + " '" + product.getName() + "'");
                        System.out.println("If you'd like to buy more " + productName + ", we still have " + product.getQuantity() + " left.");
                        return true;
                    }
                }
            }
        }
        System.out.println("Sorry, we don't have '" + productName + "' in " + producerName);
        return false;
    }
}