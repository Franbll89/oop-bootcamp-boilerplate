package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    public void setup() {
        this.rectangle = new Rectangle(2, 5);
    }


    @Test
    public void itShouldReturnPerimeter() {

        float result = rectangle.getPerimeter();
        float expected = 14;

        assertEquals(result, expected);
    }

    @Test
    public void itShouldReturnArea() {

        float result = rectangle.getArea();
        float expected = 10;

        assertEquals(result, expected);
    }
}
