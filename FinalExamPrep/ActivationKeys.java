package FinalExamPrep;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int startIndex = 0;
        int endIndex = 0;
        String substring = "";

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("Generate")) {
            String command = commandInput.split(">>>")[0];
            switch (command) {
                case "Contains":
                    substring = commandInput.split(">>>")[1];
                    if (input.contains(substring)) {
                        System.out.printf("%s contains %s%n", input, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String lowerOrUpper = commandInput.split(">>>")[1];
                    startIndex = Integer.parseInt(commandInput.split(">>>")[2]);
                    endIndex = Integer.parseInt(commandInput.split(">>>")[3]);

                    substring = input.substring(startIndex, endIndex);
                    if (lowerOrUpper.equals("Upper")) {
                        input = input.replace(substring, substring.toUpperCase());
                        System.out.println(input);
                    } else {
                        input = input.replace(substring, substring.toLowerCase());
                        System.out.println(input);
                    }

                    break;
                case "Slice":
                    startIndex = Integer.parseInt(commandInput.split(">>>")[1]);
                    endIndex = Integer.parseInt(commandInput.split(">>>")[2]);

                    substring = input.substring(startIndex, endIndex);
                    input = input.replace(substring, "");

                    System.out.println(input);

                    break;
            }

            commandInput = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + input);

    }
}
