package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.StringJoiner;


public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }
    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            sb.append(shape.getShapeName());
            sb.append("\n");
        }
        return sb.toString();
    }
}