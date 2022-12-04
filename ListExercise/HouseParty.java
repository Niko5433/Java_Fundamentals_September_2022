package ListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandNum = Integer.parseInt(scanner.nextLine());

        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < commandNum; i++) {
            String guestName = scanner.nextLine();

            if (guestName.contains("is going")){
                String name = guestName.split(" ")[0];
                if(guestList.contains(name)){
                    System.out.println(name + " " + "is already in the list!");
                } else {
                    guestList.add(name);
                }

            } else if (guestName.contains("is not going")){
                String name = guestName.split(" ")[0];
                if(guestList.contains(name)){
                    guestList.removeAll(Collections.singleton(name));
                } else {
                    System.out.println(name + " " + "is not in the list!");
                }

            }

        }
        for (String name:guestList) {
            System.out.println(name);
        }
    }
}
