package MethodsLab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        singOfInteger(number);
    }
    public static void singOfInteger(int number1){
        if (number1 > 0){
            System.out.printf("The number %d is positive.", number1);
        } else if (number1 < 0) {
            System.out.printf("The number %d is negative.", number1);
        } else {
            System.out.printf("The number %d is zero.", number1);
        }
    }
}
