package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.sql.SQLOutput;

public class StreamMain {

    public static void main(String[] args) {

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("\n");
        String text1 = "Just some poem";
        String text2 = "Poem here, poem there";
        poemBeautifier.beautify(text1, (text) -> "***" + text + "***");
        poemBeautifier.beautify(text1, (text) -> text.toUpperCase());
        poemBeautifier.beautify(text1, (text) -> text.replace("some", "a"));
        poemBeautifier.beautify(text1, (text) -> "IT'S " + text.replace("some", "a").toUpperCase() + "!!!");
        poemBeautifier.beautify(text2, (text) -> "<< " + text.replace("poem", "not") + " >>");
        poemBeautifier.beautify(text2, (text) -> text + ", poem everywhere!");
        System.out.println("\n");

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }
}