package FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> mileageMap = new LinkedHashMap<>();
        Map<String, Integer> fuelMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            //"{car}|{mileage}|{fuel}"
            String[] carData = scanner.nextLine().split("\\|");
            String car = carData[0];
            int mileage = Integer.parseInt(carData[1]);
            int fuel = Integer.parseInt(carData[2]);
            mileageMap.put(car, mileage);
            fuelMap.put(car, fuel);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String carCommand = input.split(" : ")[0];
            String car = input.split(" : ")[1];

            switch (carCommand) {
                case "Drive":
                    //•	"Drive : {car} : {distance} : {fuel}":
                    int distance = Integer.parseInt(input.split(" : ")[2]);
                    int neededFuel = Integer.parseInt(input.split(" : ")[3]);
                    int consumption = fuelMap.get(car) - neededFuel;
                    if (consumption > 0) {
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, neededFuel);
                        fuelMap.put(car, fuelMap.get(car) - neededFuel);
                        mileageMap.put(car, mileageMap.get(car) + distance);
                        if (mileageMap.get(car) >= 100000) {
                            System.out.printf("Time to sell the %s!%n", car);
                            mileageMap.remove(car);
                            fuelMap.remove(car);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    //•	"Refuel : {car} : {fuel}":
                    int fuelToRefuel = Integer.parseInt(input.split(" : ")[2]);
                    int amountOfFuel = 0;
                    if (fuelMap.get(car) + fuelToRefuel > 75) {
                        amountOfFuel = 75 - fuelMap.get(car);
                        fuelMap.put(car, 75);
                    } else {
                        fuelMap.put(car, fuelMap.get(car) + fuelToRefuel);
                        amountOfFuel = fuelToRefuel;
                    }
                    System.out.printf("%s refueled with %d liters%n", car, amountOfFuel);

                    break;
                case "Revert":
                    //•	"Revert : {car} : {kilometers}":
                    int kmToRevert = Integer.parseInt(input.split(" : ")[2]);
                    if (mileageMap.get(car) - kmToRevert < 10000) {
                        mileageMap.put(car, 10000);
                    } else {
                        mileageMap.put(car, mileageMap.get(car) - kmToRevert);
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kmToRevert);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : mileageMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue(), fuelMap.get(entry.getKey()));
        }

    }
}
