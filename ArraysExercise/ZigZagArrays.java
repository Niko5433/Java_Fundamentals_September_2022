package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArrays = new String[n];
        String[] secondArrays = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            String firstNumber = numbers[0];
            String secondNumber = numbers[1];

            if (i % 2 == 0) {
                secondArrays[i - 1] = firstNumber;
                firstArrays[i - 1] = secondNumber;
            } else {
                firstArrays[i - 1] = firstNumber;
                secondArrays[i - 1] = secondNumber;
            }

        }
        System.out.println(String.join(" ", firstArrays));
        System.out.println(String.join(" ", secondArrays));
    }
}
