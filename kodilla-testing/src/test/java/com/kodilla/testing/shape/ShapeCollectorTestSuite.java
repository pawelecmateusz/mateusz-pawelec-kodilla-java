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
        @DisplayName("Test adding figures")
        @Test
        public void testAddFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle");
            //when
            shapeCollector.addFigure(circle);
            //then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
        }
        @DisplayName("Test removing figures")
        @Test
        public void testRemoveFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle");
            shapeCollector.addFigure(circle);
            //when
            shapeCollector.removeFigure(circle);
            //then
            Assertions.assertFalse(shapeCollector.shapes.contains(circle));
        }
        @DisplayName("Test getting figures")
        @Test
        public void testGetFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle");
            shapeCollector.addFigure(circle);
            //when
            shapeCollector.getFigure(0);
            //then
            Assertions.assertEquals(circle, shapeCollector.getFigure(0));
        }
        @DisplayName("Test showing figures")
        @Test
        public void testShowFigures() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("Circle");
            Square square = new Square("Square");
            Triangle triangle = new Triangle("Triangle");
            //when
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //then
            Assertions.assertEquals("Circle\nSquare\nTriangle\n", shapeCollector.showFigures());

        }

    }
}
