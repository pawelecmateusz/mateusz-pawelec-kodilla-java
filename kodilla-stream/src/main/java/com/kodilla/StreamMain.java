package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.LocalDate.now;

public class StreamMain {

    public static void main(String[] args) {
        Forum forumUsers = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forumUsers.getList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> Period.between(user.getDateOfBirth(), now()).getYears()>=20)
                .filter(user -> user.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}