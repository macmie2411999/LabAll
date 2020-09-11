package Lab1;

public class Ball {
    // fields
    private String nameOwner;
    private int sizeOfBall;

    // constructors
    public Ball(String nameOwner, int sizeOfBall) {
        this.nameOwner = nameOwner;
        this.sizeOfBall = sizeOfBall;
    }

    public Ball(String nameOwner) {
        this.nameOwner = nameOwner;
        this.sizeOfBall = 10;
    }

    public Ball(int sizeOfBall) {
        this.nameOwner = "Zack";
        this.sizeOfBall = sizeOfBall;
    }

    public Ball() {
        this.nameOwner = "Zack";
        this.sizeOfBall = 10;
    }

    public void setLong(int sizeOfBall) {
        this.sizeOfBall = sizeOfBall;
    }

    public void setnameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getnameOwner() {
        return this.nameOwner;
    }

    public int getLong() {
        return sizeOfBall;
    }

    // return string
    public String toString() {
        return "--------------Ball-------------\nOwner: " + this.nameOwner + "\nRadius: " + this.sizeOfBall;
    }
}
