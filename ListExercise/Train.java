package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int capacityOfSeats = Integer.parseInt(scanner.nextLine());

        wagons = fillWagons(scanner, wagons, capacityOfSeats);
        printWagonsState(wagons);

    }

    private static void printWagonsState(List<Integer> wagons) {
        for (int num : wagons) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> fillWagons(Scanner scanner, List<Integer> wagons, int capacityOfSeats) {

        String input = "";

        while (!(input = scanner.nextLine()).equals("end")) {

            String[] command = input.split(" ");
            int people = 0;
            if (command[0].equals("Add")) {
                int wagon = Integer.parseInt(command[1]);
                wagons.add(wagon);
            } else {
                people = Integer.parseInt(command[0]);
                wagons = searchForSeats(wagons, people, capacityOfSeats);
            }


        }
        return wagons;
    }

    private static List<Integer> searchForSeats(List<Integer> wagons, int people, int capacityOfSeats) {

        for (int i = 0; i < wagons.size(); i++) {

            if (wagons.get(i) + people <= capacityOfSeats) {
                wagons.set(i, wagons.get(i) + people);
                break;
            }
        }
        return wagons;
    }
}
