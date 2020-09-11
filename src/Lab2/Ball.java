package Lab2;

public class Ball {
    // fileds
    private double x = 0.0;
    private double y = 0.0;
    // private double speed = 0.0;

    //constructor
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
    }

    // getter and setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // set fist position
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*
    // set fist speed
    public void setXYSpeed(double speed){
        this.speed = speed;
    }
    */

    //increase
    public void moved(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    // return string
    public String toString() {
        return "Ball@(" + this.getX() + "," + this.getY() + ")";
    }
}
