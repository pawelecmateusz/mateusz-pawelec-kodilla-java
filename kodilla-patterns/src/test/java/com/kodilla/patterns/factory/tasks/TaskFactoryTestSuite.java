package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //Then
        assertEquals("Shopping", shoppingTask.getTaskName());
        assertFalse(shoppingTask.isTaskExecuted());
    }
    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        //Then
        assertEquals("Painting", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }
    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        //Then
        assertEquals("Driving", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }
}