package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startSymbol = Integer.parseInt(scanner.nextLine());
        int endSymbol = Integer.parseInt(scanner.nextLine());

        for (int code = startSymbol; code <= endSymbol; code++) {
            System.out.print((char) code + " ");
        }
    }
}
