package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < numbersArr.length; index++) {
            int currentNumber = numbersArr[index];

            for (int i = index + 1; i < numbersArr.length; i++) {
                int num = numbersArr[i];

                if (currentNumber + num == magicNumber){
                    System.out.println(currentNumber + " " + num);
                }

            }

        }
    }
}
