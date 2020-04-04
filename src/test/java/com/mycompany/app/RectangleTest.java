package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @Test
    void area_shouldReturn12WhenInputLengthIs4AndWidthIs3(){
        Rectangle rectangle = new Rectangle();

        int result = rectangle.area(4,3);

        assertEquals(12,result);
    }
}
