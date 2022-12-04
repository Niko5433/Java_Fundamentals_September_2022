package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        while (!number.equals("END")){
            if (!isPalindrome(number)){
                System.out.println("false");
            } else {
                System.out.println("true");
            }
            number = scanner.nextLine();
        }

    }

    private static boolean isPalindrome(String number) {

        String reverseNumber = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reverseNumber += number.charAt(i);
        }

        return number.equals(reverseNumber);
    }
}
