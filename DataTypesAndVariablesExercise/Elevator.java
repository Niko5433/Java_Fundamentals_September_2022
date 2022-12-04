package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int person = Integer.parseInt(scanner.nextLine());
        double capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(person / capacity);

        System.out.printf("%.0f", courses);
    }
}
