package Lab1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tom", 5);
        Dog d2 = new Dog("Bob");
        Dog d3 = new Dog(2);
        Dog d4 = new Dog();
        d1.getInformationOfDog();
        d2.getInformationOfDog();
        d3.getInformationOfDog();
        d4.getInformationOfDog();
    }
}
