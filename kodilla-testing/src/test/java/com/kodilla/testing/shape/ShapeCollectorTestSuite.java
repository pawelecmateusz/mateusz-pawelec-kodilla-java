package com.kodilla.testing.shape;
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.jupiter.api.*;

import java.util.function.BooleanSupplier;

@DisplayName("TDD: Shape Test")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for shapes")
    class TestShapes {
        @Test
        public void testAddFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            //when
            shapeCollector.addFigure(circle);
            //then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
        }
        @Test
        public void testRemoveFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            shapeCollector.addFigure(circle);
            //when
            boolean remove = shapeCollector.removeFigure(circle);
            //then
            Assertions.assertTrue(remove);
        }
        @Test
        public void testGetFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            shapeCollector.addFigure(circle);
            //when
            shapeCollector.getFigure(0);
            //then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
        }

    }
}
