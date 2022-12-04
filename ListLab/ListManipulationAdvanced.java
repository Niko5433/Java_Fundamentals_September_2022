package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] commandArr = input.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Contains":
                    int containsNum = Integer.parseInt(commandArr[1]);
                    //Contains {number} – check if the list contains the number. If yes, print "Yes", otherwise, print "No such number"
                    printContainsNumber(numbersList,containsNum);

                    break;
                case "Print":
                    if (commandArr[1].equals("even")) {
                        //Print even – print all the numbers that are even separated by a space
                        printEvenNum(numbersList);

                    } else if (commandArr[1].equals("odd")) {
                        //Print odd – print all the numbers that are oddly separated by a space
                        printOddNum(numbersList);

                    }
                    break;
                case "Get":
                    //Get sum – print the sum of all the numbers
                    sumAllNumbers(numbersList);

                    break;
                //Filter {condition} {number} – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="
                case "Filter":
                    String condition = commandArr[1];
                    int num = Integer.parseInt(commandArr[2]);
                    printFilteredNum(numbersList,condition,num);
                    break;

            }
            input = scanner.nextLine();
        }
    }
    public static void printContainsNumber (List<Integer> numbersList, int containsNum){
        if (numbersList.contains(containsNum)){
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
    public static void printEvenNum (List <Integer> numbersList){
        for (int num:numbersList) {
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void printOddNum (List <Integer> numbersList){
        for (int num:numbersList) {
            if (num % 2 != 0){
                System.out.print(num + " ");
            }

        }
        System.out.println();
    }
    public static void sumAllNumbers (List <Integer> numbersList){
        int sumNum = 0;
        for (int num:numbersList) {
            sumNum += num;
        }
        System.out.println(sumNum);
    }
    public static void printFilteredNum (List <Integer> numbersList, String condition, int num){
        //The condition will be either '<', '>', ">=", "<="
        switch (condition){
            case "<":
                for (int number:numbersList) {
                    if (number < num){
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (int number:numbersList) {
                    if (number > num){
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int number:numbersList) {
                    if (number >= num){
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int number:numbersList) {
                    if (number <= num){
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
                break;
        }
    }
}
