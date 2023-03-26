package com.kodilla.good.patterns.practice.one;

public class ProducerHealthyShop implements FoodProducer {

    private final String producerName;
    private final String address;

    public ProducerHealthyShop(String producerName, String address) {
        this.producerName = producerName;
        this.address = address;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "'" + getProducerName() + "' from " + getAddress();
    }

    @Override
    public boolean process() {
        System.out.println("Order Processed");
        return true;
    }

    @Override
    public String getName() {
        return "Healthy Shop";
    }
}