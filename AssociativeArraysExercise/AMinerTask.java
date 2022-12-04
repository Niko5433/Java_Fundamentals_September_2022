package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        LinkedHashMap<String, Integer> resourceMap = new LinkedHashMap<>();
        while (!resource.equals("stop")) {
            String quantity = scanner.nextLine();
            int currentQuantity = Integer.parseInt(quantity);

            resourceMap.putIfAbsent(resource, 0);
            resourceMap.put(resource, resourceMap.get(resource) + currentQuantity);


            resource = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());
        }

    }
}
