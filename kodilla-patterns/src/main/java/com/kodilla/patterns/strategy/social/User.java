package com.kodilla.patterns.strategy.social;

public sealed class User
        permits Millennials, YGeneration, ZGeneration {
    private final String username;

    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String sharePost() {
        return socialPublisher.share();
    }
    public void  setSharingStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}