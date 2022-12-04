package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstNumbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt (Integer::parseInt).toArray();
        int[] secondNumbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt (Integer::parseInt).toArray();

        int sum = 0;
        int index = 0;
        boolean isIdentical = true;

        for (int i = 0; i < firstNumbersArr.length; i++) {

            int firstNumber = firstNumbersArr[i];
            int secondNumber = secondNumbersArr[i];

            if (firstNumber == secondNumber){
                sum += firstNumber;
            } else {
                index = i;
                isIdentical = false;
                break;
            }
        }
        if (isIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }
    }
}
