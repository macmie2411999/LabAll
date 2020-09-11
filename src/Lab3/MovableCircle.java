package Lab3;

public class MovableCircle implements Movable {
    // fields
    private int radius;
    private MovablePoint center;

    // constructors
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    //override methods
    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    // return string
    public String toString() {
        return this.center.toString() + ", radius: " + this.radius;
    }
}
