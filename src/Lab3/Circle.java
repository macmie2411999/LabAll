package Lab3;

public class Circle extends Shape {
    // fields
    private double radius;

    // constructors
    public Circle() {
    }

    ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    // getter and setter
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // override methods
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + this.radius + ", color: " + this.color + ", filled: " + this.filled + ",area: " + this.getArea() + ",perimeter: " + this.getPerimeter();
    }
}
