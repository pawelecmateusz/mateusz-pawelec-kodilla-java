package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DefaultOrderRepository implements OrderRepository{
    private List<Order> orders = new ArrayList<>();

    @Override
    public void createOrder(Order userId, Order productId) {
// TODO: 10.03.2023 tworzenie produktu
        orders.add(new Order(UUID.randomUUID(), UUID.randomUUID()));
    }
}