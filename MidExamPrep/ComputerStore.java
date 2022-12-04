package MidExamPrep;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String price = scanner.nextLine();
        double totSum = 0;
        boolean isEquals = true;
        if (price.equals("special") || price.equals("regular")){
            totSum = 0;
            isEquals = false;
        }
        double priceWithDiscount = 0;
        double priceWithTax = 0;

        while (isEquals) {
            double priceTag = Double.parseDouble(price);
            if (priceTag > 0) {
                totSum += priceTag;
            } else {
                System.out.println("Invalid price!");
            }

            price = scanner.nextLine();
            if (price.equals("special") || price.equals("regular")) {
                isEquals = false;
            }
        }
        if (totSum == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totSum);
            double tax = totSum * 0.2;
            priceWithTax = totSum + tax;
            if (price.equals("special")) {
                priceWithDiscount = priceWithTax - (priceWithTax * 0.1);
            } else {
                priceWithDiscount = priceWithTax;
            }
            System.out.printf("Taxes: %.2f$%n", tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", priceWithDiscount);
        }

    }
}
