package com.kodilla.testing.shape;
import java.util.ArrayList;


public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if(shapes.remove(shape)) {
            return true;
        } else {
            return false;
        }
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public Object showFigures() {
        return shapes;
    }
}