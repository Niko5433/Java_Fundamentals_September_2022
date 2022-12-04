package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= rotations; rotation++) {
            int firstNumber = numbersArr[0];

            for (int index = 0; index < numbersArr.length - 1; index++) {
                numbersArr[index] = numbersArr[index + 1];

            }
            numbersArr[numbersArr.length - 1] = firstNumber;

        }
        for (int numbers : numbersArr
        ) {
            System.out.print(numbers + " ");

        }

    }
}
