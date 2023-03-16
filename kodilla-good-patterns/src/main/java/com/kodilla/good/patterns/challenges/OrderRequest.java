package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private Product product;

    private User user;
    private LocalDateTime orderDate;

    public OrderRequest(final Product product, final User user, final LocalDateTime orderDate) {
        this.product = product;
        this.user = user;
        this.orderDate = orderDate;
    }
    public Product getProduct() {
        return product;
    }

    public User getUser() { return user; }

    public LocalDateTime getOrderDate() { return orderDate; }

}