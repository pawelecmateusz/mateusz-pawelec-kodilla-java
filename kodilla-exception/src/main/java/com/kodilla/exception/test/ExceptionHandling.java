package com.kodilla.exception.test;

import com.kodilla.exception.nullpointer.MessageNotSentException;

import java.io.IOException;
import java.security.KeyStore;

public class ExceptionHandling {

    public static void main(String[] args) throws IOException {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(1.9, 1.4);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Wrong Input!");
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}