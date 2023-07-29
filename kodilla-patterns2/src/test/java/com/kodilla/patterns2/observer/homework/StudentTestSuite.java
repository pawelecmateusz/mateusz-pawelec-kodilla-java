package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuite {

    @Test
    public void testUpdate() {
        // Given
        Student studentJava1 = new StudentJava("John Wick");
        Student studentJava2 = new StudentJava("Wendy Spendy");
        Student studentJava3 = new StudentJava("Julie Smith");

        Mentor mentor1 = new Mentor("Bruce Wayne");
        Mentor mentor2 = new Mentor("Jack Ryan");
        studentJava1.registerObserver(mentor1);
        studentJava2.registerObserver(mentor2);
        studentJava3.registerObserver(mentor1);

        // When
        studentJava1.addTask("Hibernate");
        studentJava2.addTask("Springboot");
        studentJava1.addTask("Lombok");
        studentJava3.addTask("Collections");
        studentJava2.addTask("Lombok");
        studentJava1.addTask("Springboot");
        studentJava3.addTask("Tests");

        // Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}