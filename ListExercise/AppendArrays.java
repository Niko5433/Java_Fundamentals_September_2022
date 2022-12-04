package ListExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(numbersList);
        String result = numbersList.toString().replaceAll("[\\]\\[,]", "").trim();
        result = result.replaceAll("\\s+", " ");

        System.out.println(result);
        

    }
}
