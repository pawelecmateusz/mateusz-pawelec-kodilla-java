package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private Product product;
    private User user;
    private boolean isBought;

    public OrderDto(final Product product, final User user, final boolean isBought) {
        this.product = product;
        this.user = user;
        this.isBought = isBought;
    }
    public Product getProduct() { return product; }
    public User getUser() { return user; }

    public boolean isBought() { return isBought; }

}
