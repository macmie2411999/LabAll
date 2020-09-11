package Lab3;

import java.util.Scanner;

public class TestShape {
    public static void main(String args[]) {
        //System.out.println("--------------CIRCLE---------------");
        //testCircle();
        //System.out.println("--------------RECTANGE---------------");
        //testRectangle();
        //System.out.println("--------------SQUARE---------------");
        //testSquare();
        task3();
    }

    public static void task3() {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());
        // need to downcast to Circle because only Circle has getRadius()

        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape();
        // abstract method couldn't be used to creat instants

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(((Rectangle) s3).getLength());
        // need to downcast to Rectangle because only Rectangle has getLength()

        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSide());
        // need to downcast to Square because only Square has getSide()

        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());
        // Rectangle have not getSide()
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }

    public static void testCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius of circle: ");
        Circle newCircle = new Circle(sc.nextDouble());
        sc.nextLine();
        System.out.print("Color of circle: ");
        newCircle.setColor(sc.nextLine());
        System.out.print("Circle filled (true/false): ");
        newCircle.setFilled(sc.nextBoolean());
        System.out.print(newCircle.toString());
        sc.close();
    }

    public static void testRectangle() {
        Rectangle newRectangle = new Rectangle(5, 7, "White", false);
        System.out.println(newRectangle.toString());
    }

    public static void testSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.print("yes: Load default, no: Creat new one. Yes/no?: ");
        if (sc.nextLine().equals("yes")) {
            Square newSquare = new Square(5, "Blue", true);
            System.out.println(newSquare.toString());
        } else {
            Square newSquare = new Square();
            System.out.print("Side of square: ");
            newSquare.setSide(sc.nextDouble());
            sc.nextLine();
            System.out.print("Color of circle: ");
            newSquare.setColor(sc.nextLine());
            System.out.print("Square filled (true/false): ");
            newSquare.setFilled(sc.nextBoolean());
            System.out.print(newSquare.toString());
        }
        sc.close();
    }
}
