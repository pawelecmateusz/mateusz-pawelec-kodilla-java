package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    public Square(String name){
        this.name = name;
    }
    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public void getField() {

    }
}
