package FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretMessage = scanner.nextLine();

        String commandRequests = scanner.nextLine();
        while (!commandRequests.equals("Reveal")) {
            String[] commandRequestsArr = commandRequests.split(":\\|:");
            String command = commandRequestsArr[0];

            switch (command) {
                case "InsertSpace":
                    //•	"InsertSpace:|:{index}":
                    int index = Integer.parseInt(commandRequestsArr[1]);
                    String firstPart = secretMessage.substring(0, index);
                    String secondPart = secretMessage.substring(index);
                    secretMessage = firstPart.concat(" ").concat(secondPart);
                    System.out.println(secretMessage);
                    break;
                case "Reverse":
                    //•	"Reverse:|:{substring}":
                    String substringToReverse = commandRequestsArr[1];
                    String reversedString = "";
                    if (secretMessage.contains(substringToReverse)) {
                        String forReplace = new StringBuilder(substringToReverse).reverse().toString();
                        secretMessage = secretMessage.replaceFirst(Pattern.quote(substringToReverse), "") + forReplace;
                        System.out.println(secretMessage);

                    } else {
                        System.out.println("error");
                    }

                    break;
                case "ChangeAll":
                    //•	"ChangeAll:|:{substring}:|:{replacement}":
                    String substring = commandRequestsArr[1];
                    String replacement = commandRequestsArr[2];

                    secretMessage = secretMessage.replaceAll(substring, replacement);
                    System.out.println(secretMessage);
                    break;
            }
            commandRequests = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s%n", secretMessage);
    }
}
