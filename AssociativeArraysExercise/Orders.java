package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();

        while (!product.equals("buy")) {
            String productName = product.split(" ")[0];
            double pricePerProduct = Double.parseDouble(product.split(" ")[1]);
            int quantity = Integer.parseInt(product.split(" ")[2]);

            productsPrice.put(productName, pricePerProduct);

            if (!productsQuantity.containsKey(productName)) {
                productsQuantity.put(productName, quantity);
            } else {
                productsQuantity.put(productName, productsQuantity.get(productName) + quantity);
            }

            product = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productsQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }

    }
}
