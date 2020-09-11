package Lab3;

public class Square extends Rectangle {
    // constructors
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // getter and setter
    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    // override methods
    @Override
    public String toString() {
        return "Square with side " + this.width + ", color: " + this.color + ", filled: " + this.filled + ",area: " + this.getArea() + ",perimeter: " + this.getPerimeter();
    }
}
