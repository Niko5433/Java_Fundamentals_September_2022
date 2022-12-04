package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] commandArr = input.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    //Add {number}: add a number to the end of the list
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    numbersList.add(numToAdd);

                    break;
                case "Remove":
                    //Remove {number}: remove a number from the list
                   int numToRemove = Integer.parseInt(commandArr[1]);
                   numbersList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    //RemoveAt {index}: remove a number at a given index
                    int indexToRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove(indexToRemove);

                    break;
                case "Insert":
                    //Insert {number} {index}: insert a number at a given index
                    int numToInsert = Integer.parseInt(commandArr[1]);
                    int index = Integer.parseInt(commandArr[2]);
                    numbersList.add(index,numToInsert);

                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
    }
}
