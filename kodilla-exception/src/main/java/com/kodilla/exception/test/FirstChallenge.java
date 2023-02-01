package com.kodilla.exception.test;
public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a/b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException a) {
            System.out.println("'No! Try not. Do. Or do not. There is no try. ~Yoda' " + a);
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}