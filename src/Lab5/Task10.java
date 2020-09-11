package Lab5;

import java.util.Scanner;

public class Task10 {
    static int newNumber = 0;
    static int maxPosition = 1;

    public static void main(String args[]) {
        int number = inputNumber();
        findPosition(number);
        rebuiltNumber(number);
        System.out.println(newNumber);
    }

    // get input number
    public static int inputNumber() {
        System.out.println("Your number: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    // Use recursion to find the numbers of letter of input number
    public static void findPosition(int number) {
        if ((number / Math.pow(10, maxPosition)) >= 1) {
            ++maxPosition;
            findPosition(number);
        } else {
            return;
        }
    }

    // re-build new number
    public static void rebuiltNumber(int number) {
        newNumber += (number % 10) * Math.pow(10, maxPosition - 1);
        maxPosition--;
        if (maxPosition == 0) {
            return;
        }
        number = (int) (number / 10);
        rebuiltNumber(number);
    }
}
