package ObjectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String [] inputArr = input.split("\\s+");

        Random numberGenerator = new Random();

        for (int i = 0; i < inputArr.length; i++) {
            int firstIndex = numberGenerator.nextInt(inputArr.length);
            int secondIndex = numberGenerator.nextInt(inputArr.length);

            String oldIndex = inputArr[firstIndex];
            inputArr[firstIndex] = inputArr[secondIndex];
            inputArr[secondIndex] = oldIndex;

        }
        System.out.println(String.join(System.lineSeparator(),inputArr));

    }
}
