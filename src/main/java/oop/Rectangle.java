package oop;

public class Rectangle {

    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float calculatePerimeter() {
        return 2 * (width + height);
    }

    public float calculateArea() {
        return width * height;
    }
}
