package Lab3;

public class MovableRectangle implements Movable {
    // fileds
    private MovablePoint topleft;
    private MovablePoint bottomRight;

    // constructor
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    //override methods
    @Override
    public void moveUp() {
        this.topleft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        this.topleft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        this.topleft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        this.topleft.moveRight();
        this.bottomRight.moveRight();
    }

    // return string
    public String toString() {
        return "x1: " + this.topleft.x + ",y1: " + this.topleft.y + ",x2: " + this.bottomRight.x + ",y2: " + this.bottomRight.y + ",xSpeed: " + this.topleft.xSpeed + ", ySpeed:  " + this.topleft.ySpeed;
    }
}
