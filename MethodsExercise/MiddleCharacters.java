package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //въвеждаме входни данни
        String text = scanner.nextLine();

        printMiddleCharacters(text);
    }

    public static void printMiddleCharacters(String text) {
        if (text.length() % 2 != 0) {
            int middleSymbol = text.length() / 2;
            System.out.println(text.charAt(middleSymbol));
        } else {

            int firstMiddleSymbol = text.length() / 2 - 1;
            int secondMiddleSymbol = text.length() / 2;

            System.out.println(text.charAt(firstMiddleSymbol) + "" + text.charAt(secondMiddleSymbol));
        }
    }
}
