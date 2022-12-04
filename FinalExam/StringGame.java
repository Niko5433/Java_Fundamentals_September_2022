package FinalExam;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("Done")) {
            String[] commandArr = commandInput.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Change": //"Change {char} {replacement}"
                    String symbolToReplace = commandArr[1];
                    String replacement = commandArr[2];
                    text = text.replaceAll(symbolToReplace, replacement);
                    System.out.println(text);
                    break;
                case "Includes": //"Includes {substring}"
                    String includedSubstring = commandArr[1];
                    if (text.contains(includedSubstring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End": //"End {substring}"
                    String endSubstring = commandArr[1];
                    if (text.endsWith(endSubstring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase": //"Uppercase"
                    text = text.toUpperCase();
                    System.out.println(text);
                    break;
                case "FindIndex": //"FindIndex {char}"
                    String charToFind = commandArr[1];
                    int index = text.indexOf(charToFind);
                    System.out.println(index);
                    break;
                case "Cut": //Cut {startIndex} {count}"
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int count = Integer.parseInt(commandArr[2]) + startIndex;
                    text = text.substring(startIndex, count);
                    System.out.println(text);
                    break;
            }
            commandInput = scanner.nextLine();
        }

    }
}
