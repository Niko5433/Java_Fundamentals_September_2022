package MidExam;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double pricePackageFlour = Double.parseDouble(scanner.nextLine());
        double priceSingleEgg = Double.parseDouble(scanner.nextLine());
        double priceSingleApron = Double.parseDouble(scanner.nextLine());

        //educ set for student = 1 flour, 10 eggs, 1 apron
        //apronPrice * (students + 20%) + eggPrice * 10 * (students) + flourPrice * (students - freePackages)
        //10 * (3) + 0.10 * 10 * (2) + 1 * (2) = 34.00

        double totApron = Math.ceil(students + (students * 0.2));
        double totPriceApron = priceSingleApron * totApron;
        double priceEggs = priceSingleEgg * (10 * students);
        double totFreePackages = Math.ceil(students - students/5.0);
        double totFlour = pricePackageFlour * totFreePackages;

        double totSum = totPriceApron + priceEggs + totFlour;

        if (totSum <= budget){
            System.out.printf("Items purchased for %.2f$.", totSum);
        } else if (totSum > budget) {
            System.out.printf("%.2f$ more needed.", totSum - budget);
        }
    }
}
