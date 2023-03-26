package com.kodilla.good.patterns.practice.one;

public class ProducerGlutenFreeShop implements FoodProducer {

    private final String producerName;
    private final String address;

    public ProducerGlutenFreeShop(String producerName, String address) {
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
        System.out.println("Processed");
        return true;
    }

    @Override
    public String getName() {
        return "Gluten Free Shop";
    }
}