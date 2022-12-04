package FinalExamPrep;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        String commandInput = scanner.nextLine();

        while(!commandInput.equals("Done")){
            String command = commandInput.split(" ")[0];

            switch (command){
                case "TakeOdd":
                    String newPassword = getOddCharacters(password);
                    password = newPassword;
                    System.out.println(newPassword);
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandInput.split(" ")[1]);
                    int length = Integer.parseInt(commandInput.split(" ")[2]);
                    String textToRemove = password.substring(index, index + length);
                    password = password.replaceFirst(textToRemove, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = commandInput.split(" ")[1];
                    String substitute = commandInput.split(" ")[2];
                    if (password.contains(substring)){
                       password = password.replace(substring,substitute);
                        System.out.println(password);
                    }
                    else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            commandInput = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);

    }

    private static String getOddCharacters(String password) {
        StringBuilder newPassword = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            if(i % 2 != 0){
                char currentSymbol = password.charAt(i);
                newPassword.append(currentSymbol);
            }
        }
        return newPassword.toString();
    }
}
