package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    private final LocalDateTime orderDate = LocalDateTime.of(2017, 8, 1, 12, 0);

    @Override
    public boolean order(Product product, User user, LocalDateTime orderDate) {
        System.out.println("Ordered: " + product.getProduct() + " by " + user.getName());

        return true;
    }
}