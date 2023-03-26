package com.kodilla.good.patterns.challenges;

public interface OrderRepository {

    void createOrder(User userId, Product productId);
}