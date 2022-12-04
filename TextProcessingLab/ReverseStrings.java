package TextProcessingLab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!text.equals("end")) {
            String reverseWord = "";

            for (int symbol = text.length() - 1; symbol >= 0; symbol--) {
                char currentSymbol = text.charAt(symbol);
                reverseWord = reverseWord + currentSymbol;
            }
            System.out.printf("%s = %s%n", text, reverseWord);

            text = scanner.nextLine();
        }

    }
}
