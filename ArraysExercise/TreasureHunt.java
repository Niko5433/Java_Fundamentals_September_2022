package ArraysExercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lootArr = scanner.nextLine().split("\\|");

        String loot = scanner.nextLine();

        while (!lootArr.equals("Yohoho!")) {
            if (loot.contains("Loot")){

            } else if (loot.contains("Drop")){

            } else if (loot.contains("Steal")){

            }


            loot = scanner.nextLine();
        }
    }
}
