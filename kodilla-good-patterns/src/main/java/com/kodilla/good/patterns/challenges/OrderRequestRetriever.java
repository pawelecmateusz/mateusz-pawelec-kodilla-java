package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        Product product = new Product("Shoes");

        User user = new User("John", "Johnovich");

        LocalDateTime orderDate = LocalDateTime.of(2017, 8, 1, 12, 0);

        return new OrderRequest(product, user, orderDate);
    }
}