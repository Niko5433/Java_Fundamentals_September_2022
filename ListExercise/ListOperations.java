package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("Add")) {
                //•	Add {number} - add number at the end
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbersList.add(numberToAdd);

            } else if (command.contains("Insert")) {
                //•	Insert {number} {index} - insert number at given index
                int numToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);
                if (isValidIndex(numbersList, index)) {
                    numbersList.add(index, numToInsert);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Remove")) {
                //•	Remove {index} - remove that index
                int index = Integer.parseInt(command.split("\\s+")[1]);
                if (isValidIndex(numbersList, index)) {
                    numbersList.remove(index);
                } else {
                    System.out.println("Invalid index");
                }


            } else if (command.contains("Shift left")) {
                //•	Shift left {count} - first number becomes last 'count' times
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < count; i++) {
                    int firstNumber = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNumber);
                }


            } else if (command.contains("Shift right")) {
                //•	Shift right {count} - last number becomes first 'count' times
                int count = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < count; i++) {
                    int lastNumber = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, lastNumber);
                }

            }

            {
                command = scanner.nextLine();
            }
        }
        for (int num : numbersList) {
            System.out.print(num + " ");
        }
    }

    public static boolean isValidIndex(List<Integer> numbersList, int index) {
        return index >= 0 && index <= numbersList.size() - 1;
    }
}
