package FinalExamPrep;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String travelDestination = scanner.nextLine();


        String travelStops = scanner.nextLine();
        while (!travelStops.equals("Travel")) {
            String[] travelStopsArr = travelStops.split(":");
            String command = travelStopsArr[0];

            switch (command) {
                case "Add Stop":
                    //•	"Add Stop:{index}:{string}":
                    int index = Integer.parseInt(travelStopsArr[1]);
                    if (travelDestination.length() - 1 >= index && index >= 0) {
                        String stringToAdd = travelStopsArr[2];
                        String firstPart = travelDestination.substring(0, index);
                        String secondPart = travelDestination.substring(index);
                        travelDestination = firstPart.concat(stringToAdd).concat(secondPart);
                    }
                    System.out.println(travelDestination);
                    break;
                case "Remove Stop":
                    //•	"Remove Stop:{start_index}:{end_index}":
                    int firstIndex = Integer.parseInt(travelStopsArr[1]);
                    int finalIndex = Integer.parseInt(travelStopsArr[2]);
                    if (travelDestination.length() - 1 >= finalIndex && travelDestination.length() - 1 >= firstIndex && firstIndex >= 0 && finalIndex >= 0) {
                        String firstPart1 = travelDestination.substring(0, firstIndex);
                        String lastPart = travelDestination.substring(finalIndex + 1);
                        travelDestination = firstPart1.concat(lastPart);
                    }
                    System.out.println(travelDestination);
                    break;
                case "Switch":
                    //•	"Switch:{old_string}:{new_string}":
                    String oldString = travelStopsArr[1];
                    String newString = travelStopsArr[2];
                    if (travelDestination.contains(oldString)) {
                        travelDestination = travelDestination.replace(oldString, newString);
                    }
                    System.out.println(travelDestination);
                    break;

            }
            travelStops = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + travelDestination);

    }
}
