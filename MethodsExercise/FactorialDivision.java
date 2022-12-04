package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long sumFact1 = printFactorialDivision(firstNumber);
        long sumFact2 = printFactorialDivision(secondNumber);

        double factDivision = sumFact1 * 1.0 / sumFact2;

        System.out.printf("%.2f", factDivision);

    }
    public static long printFactorialDivision (int number){
        long sumFact = 1;
        for (int i = 1; i <= number ; i++) {
            sumFact = sumFact * i;
        }
        return sumFact;

    }
}
