package FinalExamPrep;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decryptedMessage = scanner.nextLine();

        String commandInput = scanner.nextLine();
        while (!commandInput.equals("Decode")) {
            String command = commandInput.split("\\|")[0];

            switch (command) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(commandInput.split("\\|")[1]);
                    String firstPart = decryptedMessage.substring(0, numberOfLetters);
                    String secondPart = decryptedMessage.substring(numberOfLetters);

                    decryptedMessage = secondPart.concat(firstPart);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandInput.split("\\|")[1]);
                    String value = commandInput.split("\\|")[2];

                    firstPart = decryptedMessage.substring(0, index);
                    secondPart = decryptedMessage.substring(index);

                    decryptedMessage = firstPart.concat(value).concat(secondPart);
                    break;
                case "ChangeAll":
                    String substring = commandInput.split("\\|")[1];
                    String replacement = commandInput.split("\\|")[2];

                    decryptedMessage = decryptedMessage.replace(substring, replacement);
                    break;
            }
            commandInput = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + decryptedMessage);
    }

}
