package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= numbersArr.length - 1; index++) {
            int currentNumber = numbersArr[index];
            if (index == numbersArr.length-1){
                System.out.println(currentNumber + " ");
                break;
            }

            boolean isTop = false;
            for (int i = index + 1; i <= numbersArr.length - 1; i++) {
                int nextNumber = numbersArr[i];
                if (currentNumber > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }

            }
            if (isTop){
                System.out.print(currentNumber + " ");
            }


        }
    }
}
