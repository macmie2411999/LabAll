package Lab5;

import java.util.Scanner;

// Palindrome: a - eve - sos - radar - reviver - rotator...

public class Taks8 {
    static int i = 0;

    public static void main(String args[]) {
        String tempWord = inputWord();
        checkPalindrome(tempWord);
    }

    // get input string
    public static String inputWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your word: ");
        String tempWord = sc.nextLine().toLowerCase();
        sc.close();
        return tempWord;
    }

    // check coditions
    public static void checkPalindrome(String tempWord) {
        byte[] tempByte = tempWord.getBytes();
        if (tempByte[i] == tempByte[tempByte.length - 1 - i]) {
            i++;
            if (i >= (tempByte.length / 2)) {
                System.out.println("The word '" + tempWord + "' is a Palindrome.");
            } else {
                checkPalindrome(tempWord);
            }
        } else {
            System.out.println("The word '" + tempWord + "' is not Palindrome.");
            return;
        }
    }
}
