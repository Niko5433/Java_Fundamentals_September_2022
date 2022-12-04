package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!isPasswordLengthValid(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isContentValid(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isConsistDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }
        if (isPasswordLengthValid(password) && isConsistDigits(password) && isContentValid(password)){
            System.out.println("Password is valid");
        }

    }

    private static boolean isPasswordLengthValid(String password) {
        //•	"Password must be between 6 and 10 characters";
        return (password.length() >= 6 && password.length() <= 10);
    }

    private static boolean isContentValid(String password) {
        //•	"Password must consist only of letters and digits";
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }

        }
        return true;
    }

    private static boolean isConsistDigits (String password){
        //•	"Password must have at least 2 digits".
        int countDigits = 0;

        for (char symbol:password.toCharArray()) {
            if (Character.isDigit(symbol)){
                countDigits++;
            }
        }
        if (countDigits < 2){
            return false;
        } else {
            return true;
        }
    }

    //•	"Password must have at least 2 digits".
}
