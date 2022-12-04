package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totAmountSpices = 0;

        while (startingYield >= 100) {
            int spice = startingYield - 26;
            days++;
            totAmountSpices += spice;
            startingYield -= 10;
        }
        System.out.println(days);
        if (totAmountSpices >= 26){
            totAmountSpices -= 26;
        }
        System.out.println(totAmountSpices);
    }
}
