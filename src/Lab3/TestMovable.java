package Lab3;

public class TestMovable {
    public static void main(String args[]) {
        //testMovablePoint();
        //testMovableCircle();
        testMovableRectangle();
    }

    public static void testMovablePoint() {
        MovablePoint newPoint = new MovablePoint(2, 3, 1, 1);
        System.out.println("-----------MOVABLEPOINT--------------");
        System.out.println("Firts position: " + newPoint.toString());
        newPoint.moveUp();
        System.out.println("New position (move up): " + newPoint.toString());
    }

    public static void testMovableCircle() {
        MovableCircle newCircle = new MovableCircle(4, 7, 2, 2, 4);
        System.out.println("-----------MOVABLECIRCLE--------------");
        System.out.println("Firts position of center: " + newCircle.toString());
        newCircle.moveDown();
        System.out.println("New position of center (move down): " + newCircle.toString());
    }

    public static void testMovableRectangle() {
        MovableRectangle newRectangle = new MovableRectangle(1, 2, 4, 1, 1, 1);
        System.out.println("-----------MOVABLERECTANGLE--------------");
        System.out.println("Firts position of top left point: " + newRectangle.toString());
        newRectangle.moveLeft();
        System.out.println("New position (move left): " + newRectangle.toString());
    }
}
