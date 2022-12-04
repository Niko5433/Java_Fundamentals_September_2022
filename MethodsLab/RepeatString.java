package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String resultText = repeatString(input, count);
        System.out.printf("%s", resultText);
    }
    private static String repeatString (String input, int count){
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + input;
        }
        return result;
    }
}
