package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    public Triangle(String name){
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