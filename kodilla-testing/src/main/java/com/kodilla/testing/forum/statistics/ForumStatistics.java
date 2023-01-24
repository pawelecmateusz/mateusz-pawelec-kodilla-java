package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {
    private Statistics statistics;
    private double avgCommentsOnUser;
    private double avgPostsOnUser;
    private double avgCommentsOnPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        int usersCount = statistics.usersNames().size();
        double avgCommentsOnUser = statistics.commentsCount()/usersCount;
        double avgPostsOnUser = statistics.postsCount()/usersCount;
        double avgCommentsOnPost = statistics.commentsCount()/statistics.postsCount();
    }

    public List<String> showStatistics(Statistics statistics) {
        List<String> statisticsList = new ArrayList<>();
        statisticsList.add("Number of users: " + statistics.usersNames().size());
        statisticsList.add("Number of posts: " + statistics.postsCount());
        statisticsList.add("Number of comments: " + statistics.commentsCount());
        statisticsList.add("Average number of comments per user: " + avgCommentsOnUser);
        statisticsList.add("Average number of posts per user: " + avgPostsOnUser);
        statisticsList.add("Average number of comments per post: " + avgCommentsOnPost);
        return statisticsList;
    }

    public List<String> usersNames() {
        return statistics.usersNames();
    }

    public int postsCount() {
        return statistics.postsCount();
    }

    public int commentsCount() {
        return statistics.commentsCount();
    }
}