package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] username = scanner.nextLine().split(", ");

        for (String word: username) {

            if(isValidUsername(word)){
                System.out.println(word);
            }
        }
    }
    public static boolean isValidUsername (String username){
        boolean isValidLength = username.length() >= 3 && username.length() <= 16;

        boolean isValidContent = false;

        for (char symbol:username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }
        }
        isValidContent = true;
        return isValidContent && isValidLength;
    }
}
