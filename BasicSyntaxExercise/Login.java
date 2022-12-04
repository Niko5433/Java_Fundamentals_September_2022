package BasicSyntaxExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //username -> входни данни
        //password -> username на обратно

        String username = scanner.nextLine();
        String password = "";

        for (int position = username.length() -1; position >= 0 ; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;

        }
        //Въвеждане на парола
        String enteredPassword = scanner.nextLine();
        int wrongPassword = 0;
        while (!enteredPassword.equals(password) ){
            //4 пъти грешна парола -> block user
            wrongPassword ++;
            if (wrongPassword == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }

            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(password)){
            System.out.printf("User %s logged in.", username);
        }


    }
}
