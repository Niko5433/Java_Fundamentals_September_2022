package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(compareInt(a,b,c));

    }
    public static int compareInt (int a, int b, int c){
        int result = 0;
        if (a < b && a < c){
            result = a;
        } else if (b < a && b < c){
            result = b;
        } else {
            result = c;
        }
        return result;
    }
}
