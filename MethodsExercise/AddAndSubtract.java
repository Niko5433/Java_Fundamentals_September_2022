package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(sumNumbers(num1,num2) - num3);

    }
    // sum first 2 integers
    private static int sumNumbers (int num1, int num2){
        return num1 + num2;
    }
}
