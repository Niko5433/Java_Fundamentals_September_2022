package MethodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input =Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleSum(input));

    }
    public static int getMultipleSum(int input) {
        int evenSum = getEvenSum(input);
        int oddSum = getOddSum(input);

        return evenSum * oddSum;
    }

    public static int getEvenSum(int input) {
        int countEven = 0;
        String inToString = Integer.toString(input);

        int[] arr = Arrays.stream(inToString.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                countEven += arr[i];
            }

        }

        return countEven;
    }

    public static int getOddSum(int input) {
        int countOdd = 0;
        String inToString = Integer.toString(input);

        int[] arr = Arrays.stream(inToString.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                countOdd += arr[i];
            }

        }
        return countOdd;
    }
}
