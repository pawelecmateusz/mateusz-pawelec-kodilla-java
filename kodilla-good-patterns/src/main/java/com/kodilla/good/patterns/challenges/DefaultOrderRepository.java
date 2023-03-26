package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DefaultOrderRepository implements OrderRepository{
    private final List<Order> orders = new ArrayList<>();

    @Override
    public void createOrder(User userId, Product productId) {
        orders.add(new Order(UUID.randomUUID(), UUID.randomUUID()));
    }
}