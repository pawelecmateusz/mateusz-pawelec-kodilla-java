package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.UUID;

public interface OrderRepository {

    void createOrder(Order userId, Order productId);
}