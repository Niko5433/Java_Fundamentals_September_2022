package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());


        int firstPower = power;
        int countPokes = 0;

        while (power >= distance) {
            power -= distance;
            countPokes++;

            if (power == firstPower / 2) {
                if (factor != 0) {
                    power = power / factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPokes);
    }
}
