package BasicSyntaxLab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        boolean isValid = true;

        if (age >= 0 && age <= 18) {
            switch (day) {
                case "Weekday":
                    price = 12;
                    break;
                case "Weekend":
                    price = 15;
                    break;
                case "Holiday":
                    price = 5;
                    break;
            }
        } else if (age > 18 && age <= 64) {
            switch (day) {
                case "Weekday":
                    price = 18;
                    break;
                case "Weekend":
                    price = 20;
                    break;
                case "Holiday":
                    price = 12;
                    break;
            }
        } else if (age > 64 && age <= 122) {
            switch (day) {
                case "Weekday":
                    price = 12;
                    break;
                case "Weekend":
                    price = 15;
                    break;
                case "Holiday":
                    price = 10;
                    break;
            }
        }else {
            isValid = false;
        } if (isValid){
            System.out.printf("%d$", price);
        }else {
            System.out.println("Error!");
        }
    }
}