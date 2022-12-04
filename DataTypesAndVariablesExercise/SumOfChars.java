package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int letter = 1; letter <= numbers; letter++) {
            char symbol = scanner.nextLine().charAt(0);
            int value = (int) symbol;
            sum += value;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
