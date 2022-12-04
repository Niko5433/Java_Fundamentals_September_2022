package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("Go Shopping!")) {
            String[] commandArray = commandInput.split(" ");
            String command = commandArray[0];

            switch (command) {
                case "Urgent":
                    String item = commandArray[1];
                    if (!shoppingList.contains(item)) {
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    String unnecessaryItem = commandArray[1];
                    if (shoppingList.contains(unnecessaryItem)) {
                        shoppingList.remove(unnecessaryItem);
                    }
                    break;
                case "Correct":
                    String oldItem = commandArray[1];
                    String newItem = commandArray[2];
                    for (int i = 0; i < shoppingList.size(); i++) {
                        String currentItem = shoppingList.get(i);
                        if (currentItem.equals(oldItem)) {
                            shoppingList.add(i, newItem);
                            shoppingList.remove(i + 1);
                        }
                    }
                    break;
                case "Rearrange":
                    String rearrangeItem = commandArray[1];
                    if (shoppingList.contains(rearrangeItem)) {
                        shoppingList.remove(rearrangeItem);
                        shoppingList.add(rearrangeItem);
                    }
                    break;
            }


            commandInput = scanner.nextLine();
        }
        for (int i = 0; i < shoppingList.size(); i++) {
            if (i == shoppingList.size()-1) {
                System.out.print(shoppingList.get(i));
            } else {
                System.out.print(shoppingList.get(i) + ", ");
            }

        }
    }
}
