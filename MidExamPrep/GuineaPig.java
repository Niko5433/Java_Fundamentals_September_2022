package MidExamPrep;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFoodKg = Double.parseDouble(scanner.nextLine());
        double quantityHayKg = Double.parseDouble(scanner.nextLine());
        double quantityCoverKg = Double.parseDouble(scanner.nextLine());
        double weightOfGuineaPig = Double.parseDouble(scanner.nextLine());


        double totalFood = quantityFoodKg * 1000;
        double totalHay = quantityHayKg * 1000;
        double totalCover = quantityCoverKg * 1000;

        for (int day = 1; day <= 30 ; day++) {
            totalFood -= 300;
            if (day % 2 == 0){
                totalHay = totalHay - (totalFood * 0.05);
            }
            if (day % 3 == 0){
                totalCover = totalCover - ((weightOfGuineaPig * 1000) / 3);
            }

        }
        if (totalFood >= 0 && totalHay >= 0 && totalCover >= 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", totalFood / 1000, totalHay / 1000, totalCover / 1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
