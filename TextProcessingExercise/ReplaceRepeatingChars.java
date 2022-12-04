package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String result = "";
        char firstChar = input.charAt(0);
        result += firstChar;

        for (int i = 1; i < input.length() ; i++) {
            char currentSymbol = input.charAt(i);

            if(currentSymbol != firstChar){
                result += currentSymbol;
                firstChar = currentSymbol;
            }

        }
        System.out.println(result);
    }
}
