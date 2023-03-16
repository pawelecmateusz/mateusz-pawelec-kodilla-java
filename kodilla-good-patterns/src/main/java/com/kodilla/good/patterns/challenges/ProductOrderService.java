package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(Product product, User user, LocalDateTime orderDate) {
        System.out.println("Ordered: " + product.getProduct() + " by " + user.getName()
                + " on: " + orderDate.getHour());

        return true;
    }
}