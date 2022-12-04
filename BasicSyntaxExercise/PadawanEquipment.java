package BasicSyntaxExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
        //•	The count of students – integer in the range [0…100].
        //•	The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
        //•	The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
        //•	The price of belts for a single belt – the floating-point number in the range [0.00…100.00].

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double totSabers = Math.ceil(countOfStudents + 0.10 * countOfStudents) * priceLightsaber;
        double totRobe = priceRobe * countOfStudents;
        double totBelt = (countOfStudents - countOfStudents / 6) * priceBelt;

        double totCosts = totBelt + totRobe + totSabers;

        if (amountOfMoney >= totCosts){
            System.out.printf("The money is enough - it would cost %.2flv.", totCosts);
        } else {
            double neededMoney = totCosts - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }

    }
}
