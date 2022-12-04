package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("Finish")) {
            String[] commandArr = commandInput.split("\\s+");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (numbersList.get(i) == numToRemove) {
                            numbersList.remove(i);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int value = Integer.parseInt(commandArr[1]);
                    int replacement = Integer.parseInt(commandArr[2]);
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (numbersList.get(i) == value) {
                            numbersList.add(i, replacement);
                            numbersList.remove(i + 1);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    int valueCollapse = Integer.parseInt(commandArr[1]);
                    numbersList.removeIf(n -> (n < valueCollapse));
                    break;
            }

            commandInput = scanner.nextLine();
        }
        for (int i = 0; i < numbersList.size(); i++) {
            int currentNum = numbersList.get(i);
            if (i == numbersList.size() - 1) {
                System.out.print(currentNum);
            } else {
                System.out.print(currentNum + " ");
            }
        }

    }
}
