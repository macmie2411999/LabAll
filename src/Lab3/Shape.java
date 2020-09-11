package Lab3;

public abstract class Shape {
    // fields
    protected String color;
    protected boolean filled;

    // constructors
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // getter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}
