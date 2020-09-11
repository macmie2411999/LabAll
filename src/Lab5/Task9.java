package Lab5;

import java.util.Scanner;

public class Task9 {
    //static fields
    static int i = 0;
    static int countZero = 0;

    public static void main(String args[]) {
        //creat 2 value
        System.out.print("Value a: ");
        String tempStringA = inputValue();
        System.out.print("Value b: ");
        String tempStringB = inputValue();
        char[] tempCharA = tempStringA.toCharArray();
        char[] tempCharB = tempStringB.toCharArray();

        // check a
        countZero(tempCharA);
        System.out.println("Value a = " + tempStringA + "have " + countZero + " numbers of 0 valid");

        // set default and then check b
        i = 0;
        countZero = 0;
        countZero(tempCharB);
        System.out.println("Value b = " + tempStringB + "have " + countZero + " numbers of 0 valid");

    }

    // get value input
    public static String inputValue() {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        return temp;
    }

    // algorithm to count 0
    public static void countZero(char[] number) {
        // first position
        if (i == 0) {
            if (number[0] == '0' && number[1] != '0') {
                countZero++;
            }
        }

        // last position and condition to stop
        if (i == number.length - 1) {
            if (number[number.length - 2] != '0' && number[number.length - 1] == '0') {
                countZero++;
            }
            return;
        }

        // middle positions
        if (i > 0) {
            if (number[i - 1] != '0' && number[i] == '0' && number[i + 1] != '0' && ((i + 1) <= number.length - 1)) {
                countZero++;
            }
        }

        // add to i and repeat
        i++;
        countZero(number);
    }
}
