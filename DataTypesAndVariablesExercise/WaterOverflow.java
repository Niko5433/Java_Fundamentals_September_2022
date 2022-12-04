package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int capacityTank = capacity;

        for (int i = 0; i < n; i++) {
            int water = Integer.parseInt(scanner.nextLine());

            if (capacityTank - water >= 0){
                capacityTank -= water;

            }else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(capacity - capacityTank);
    }
}
