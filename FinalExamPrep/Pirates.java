package FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); //Tortuga||345000||1250

        Map<String, Integer> populationMap = new LinkedHashMap<>();
        Map<String, Integer> goldMap = new LinkedHashMap<>();

        int cityCount = 0;
        while (!input.equals("Sail")) {
            String town = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);

            if (populationMap.containsKey(town)) {
                populationMap.put(town, populationMap.get(town) + population);
                goldMap.put(town, goldMap.get(town) + gold);
            } else {
                cityCount++;
                populationMap.put(town, population);
                goldMap.put(town, gold);
            }

            input = scanner.nextLine();
        }
        String commandInput = scanner.nextLine();
        while (!commandInput.equals("End")) {
            String command = commandInput.split("=>")[0];
            String city = commandInput.split("=>")[1];

            switch (command) {
                case "Plunder": //"Plunder=>{town}=>{people}=>{gold}"
                    int people = Integer.parseInt(commandInput.split("=>")[2]);
                    int gold = Integer.parseInt(commandInput.split("=>")[3]);

                    populationMap.put(city, populationMap.get(city) - people);
                    goldMap.put(city, goldMap.get(city) - gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, gold, people);

                    if (populationMap.get(city) <= 0 || goldMap.get(city) <= 0) {
                        cityCount--;
                        populationMap.remove(city);
                        goldMap.remove(city);
                        System.out.println(city + " has been wiped off the map!");
                    }
                    break;
                case "Prosper": //"Prosper=>{town}=>{gold}"
                    int prosperGold = Integer.parseInt(commandInput.split("=>")[2]);
                    if (prosperGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        goldMap.put(city, goldMap.get(city) + prosperGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", prosperGold, city, goldMap.get(city));
                    }
                    break;
            }

            commandInput = scanner.nextLine();
        }
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cityCount);

        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue(), goldMap.get(entry.getKey()));
        }

    }
}
