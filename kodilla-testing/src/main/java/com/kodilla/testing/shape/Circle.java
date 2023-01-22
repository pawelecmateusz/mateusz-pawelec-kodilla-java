package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    public Circle(String name){
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
