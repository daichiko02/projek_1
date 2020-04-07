package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void area_shouldReturn12WhenInputLengthIs4AndWidthIs3() {
        Rectangle rectangle = new Rectangle(4, 3);

        int result = rectangle.area();

        assertEquals(12, result);
    }

    @Test
    void perimeter_shouldReturn18WhenInputLengthIs5AndWidthIs4() {
        Rectangle rectangle = new Rectangle(5, 4);

        int result = rectangle.perimeter();

        assertEquals(18, result);
    }

    @Test
    void area_shouldReturn25WhenInputSideIs5() {
        Rectangle rectangle = Rectangle.makeSquare(5);

        int result = rectangle.area();

        assertEquals(25, result);
    }

    @Test
    void perimeter_shouldReturn20WhenInputSideIs5() {
        Rectangle rectangle = Rectangle.makeSquare(5);

        int result = rectangle.perimeter();

        assertEquals(20, result);
    }
}
