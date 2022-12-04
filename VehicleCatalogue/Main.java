package VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carInput = scanner.nextLine();
        List<Vehicle> vehicleDataList = new ArrayList<>();

        while (!carInput.equals("End")) {
            String typeOfCar = carInput.split(" ")[0];
            String modelOfCar = carInput.split(" ")[1];
            String colorOfCar = carInput.split(" ")[2];
            int horsepowerOfCar = Integer.parseInt(carInput.split(" ")[3]);

            Vehicle vehicle = new Vehicle(typeOfCar, modelOfCar, colorOfCar, horsepowerOfCar);
            vehicleDataList.add(vehicle);

            carInput = scanner.nextLine();
        }
        String modelCar = scanner.nextLine();
        while (!modelCar.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleDataList) {
                if (modelCar.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                    break;
                }
            }
            modelCar = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHp(vehicleDataList, "cars") );
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHp(vehicleDataList, "trucks") );
    }

    private static double getAverageHp(List<Vehicle> vehicleDataList, String type) {
        double sum = 0;
        double count = 0;
        if (type.equals("cars")) {
            for (Vehicle vehicle : vehicleDataList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHorsepower();
                    count++;
                }
            }
        } else if (type.equals("trucks")) {
            for (Vehicle vehicle : vehicleDataList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHorsepower();
                    count++;
                }
            }
        }
        if (sum == 0){
            return 0;
        }
        return sum / count;
    }
}
