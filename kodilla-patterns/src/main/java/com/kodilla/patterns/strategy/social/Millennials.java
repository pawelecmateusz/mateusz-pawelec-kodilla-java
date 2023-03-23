package com.kodilla.patterns.strategy.social;

public final class Millennials extends User {

    public Millennials(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}