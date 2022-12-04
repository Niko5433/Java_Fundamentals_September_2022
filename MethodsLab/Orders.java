package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        printPrice(product,amount);

    }

    public static void printPrice(String product, int amount) {
        if (product.equals("coffee")) {
            System.out.printf("%.2f" ,amount * 1.50);
        } else if (product.equals("water")) {
            System.out.printf("%.2f" ,amount * 1.00);
        } else if (product.equals("coke")) {
            System.out.printf("%.2f" ,amount * 1.40);
        } else if (product.equals("snacks")) {
            System.out.printf("%.2f" ,amount * 2.00);
        }
    }
}
