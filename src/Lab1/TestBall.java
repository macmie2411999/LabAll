package Lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball sw1 = new Ball("Mac", 7);
        Ball sw2 = new Ball("John");
        Ball sw3 = new Ball(8);
        Ball sw4 = new Ball();
        sw3.setnameOwner("Tom");
        System.out.println(sw1);
        System.out.println(sw2);
        System.out.println(sw3);
        System.out.println(sw4);
    }
}
