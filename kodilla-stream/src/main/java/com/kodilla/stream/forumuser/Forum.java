package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();
    public Forum() {
        usersList.add(new ForumUser(1, "crazyrabbit", 'M', LocalDate.of(1989, 10,1), 20));
        usersList.add(new ForumUser(2, "manoftheyear", 'M', LocalDate.of(1975, 5,10), 50));
        usersList.add(new ForumUser(3, "seriouswoman", 'K', LocalDate.of(1983, 3,15), 30));
        usersList.add(new ForumUser(4, "omnom", 'K', LocalDate.of(1995, 6,20), 35));
        usersList.add(new ForumUser(5, "cowboy", 'M', LocalDate.of(1986, 1,6), 5));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(usersList);
    }
}
