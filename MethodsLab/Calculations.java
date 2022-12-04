package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String function = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (function.equals("add")) {
            printAdd(num1, num2);
        } else if (function.equals("multiply")) {
            printMultiply(num1, num2);
        } else if (function.equals("subtract")) {
            printSubtract(num1, num2);
        } else if (function.equals("divide")) {
            printDivide(num1, num2);
        }
    }

    public static void printAdd(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void printMultiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void printSubtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void printDivide(int num1, int num2) {
        System.out.println(num1 / num2);
    }

}
