package Lab3;

public class MovablePoint implements Movable {
    // fields
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    // constructors
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // override methods
    @Override
    public void moveUp() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

    // return string
    public String toString() {
        return "x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ",ySpeed: " + this.ySpeed;
    }
}
