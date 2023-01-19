package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Colection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @DisplayName("check class behavior when the list is empty"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        Integer num[] = new Integer[] {};
        List<Integer> numbers = Arrays.asList(num);
        //When&Then
        Assertions.assertTrue(exterminator.exterminate(numbers).isEmpty());
    }
    @DisplayName("check class behavior when the list contains even and odd numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        Integer num[] = new Integer[] { 1, 2, 3, 4, 5 };
        List<Integer> numbers = Arrays.asList(num);
        //When
        List<Integer> even = new ArrayList<>();
        even.add(2);
        even.add(4);
        //Then
        Assertions.assertEquals(exterminator.exterminate(numbers), even);
    }
}