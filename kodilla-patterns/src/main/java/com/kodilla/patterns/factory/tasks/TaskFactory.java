package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Shopping", "Bread", 1 );
            case PAINTING -> new PaintingTask("Painting", "Green", "Paint");
            case DRIVING -> new DrivingTask("Driving", "Anywhere", "Car");
            default -> null;
        };
    }
}