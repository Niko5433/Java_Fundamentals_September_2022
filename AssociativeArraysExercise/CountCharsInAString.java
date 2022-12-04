package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        LinkedHashMap <Character, Integer> textMap = new LinkedHashMap<>();

        for (char symbol:text.toCharArray()) {
            if(symbol == ' '){
                continue;
            }

            textMap.putIfAbsent(symbol, 0);
            textMap.put(symbol, textMap.get(symbol) + 1);
        }
        for (Map.Entry<Character, Integer> entry : textMap.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(),entry.getValue());
        }

    }
}
