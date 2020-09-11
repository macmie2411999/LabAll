package Lab2;

import java.util.Scanner;

public class TestBall {
    public static void main(String args[]) {
        firstTry();
        secondTry();
    }

    public static void firstTry() {
        System.out.println("----------DEFAULT-----------");
        Ball newBall = new Ball(10, 15);
        System.out.println("First position: " + newBall.toString());
        newBall.moved(5, 5);
        System.out.println("Moved: " + newBall.toString());
    }

    public static void secondTry() {
        System.out.println("-----------------------------");
        Ball newBall = new Ball();
        System.out.println("Set position (x,y): ");
        Scanner sc = new Scanner(System.in);
        newBall.setX(sc.nextDouble());
        newBall.setY(sc.nextDouble());
        System.out.println("Position: " + newBall.toString());
        sc.close();
    }
}
