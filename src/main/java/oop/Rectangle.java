package oop;

public class Rectangle implements Shape{

    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimeter() {
        return 2*(width+height);
    }
}
