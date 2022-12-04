package BasicSyntaxExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //((daysInMonth * capsulesCount) * pricePerCapsule)

        int numOrders = Integer.parseInt(scanner.nextLine());
        //o	Price per capsule - floating-point number in the range [0.00…1000.00].
        //o	Days – integer in the range [1…31].
        //o	Capsules count - integer in the range [0…2000].


        double totPrice = 0;

        for (int i = 0; i < numOrders ; i++) {
            double pricePerCapsules = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double price = (days * capsulesCount) * pricePerCapsules;
            totPrice += price;
        System.out.printf("The price for the coffee is: $%.2f\n", price);

        }
        System.out.printf("Total: $%.2f", totPrice);

    }
}
