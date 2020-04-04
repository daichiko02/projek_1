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
}
