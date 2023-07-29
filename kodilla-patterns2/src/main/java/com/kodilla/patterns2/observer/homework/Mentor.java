package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Student student) {
        System.out.println(username + ": New task '" + student.getTask() + "' submitted by " + student.getName() + "\n" +
                " (Total No. tasks submitted by " + student.getName() + ": " + student.getTasks().size() + ")");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}