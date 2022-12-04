package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int[] specialNumAndPower = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int specialNum = specialNumAndPower[0];
        int power = specialNumAndPower[1];

        detonation(numbersList,specialNum,power);
        printRemainingSum(numbersList);

    }

    public static List<Integer> detonation(List<Integer> numbersList, int specialNum, int power) {
        if (numbersList.contains(specialNum)) {
            for (int i = 0; i < numbersList.size(); i++) {
                int currentNum = numbersList.get(i);
                if (currentNum == specialNum) {
                    int startIndex = i - power;
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    int endIndex = i + power;
                    if (endIndex == numbersList.size() - 1) {
                        endIndex = numbersList.size() - 1;
                    }
                    for (int j = startIndex; j <= endIndex ; j++) {
                        numbersList.set(j,0);
                    }
                }

            }
        }
        return numbersList;
    }
    private static void printRemainingSum (List<Integer> numbersList){
        int sum = 0;
        for (int num:numbersList) {
            sum += num;
        }
        System.out.println(sum);
    }
}
