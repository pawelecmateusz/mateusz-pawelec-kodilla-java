package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String decor = poemDecorator.decorate(text);
        System.out.println(decor);
    }
}
