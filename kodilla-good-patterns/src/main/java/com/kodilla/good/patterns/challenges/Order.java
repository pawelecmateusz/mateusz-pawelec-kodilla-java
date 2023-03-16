package com.kodilla.good.patterns.challenges;

import java.util.UUID;

public class Order {
    private UUID orderId = UUID.randomUUID();
    private UUID userId;
    private UUID productId;

    public Order(UUID userId, UUID productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }
}