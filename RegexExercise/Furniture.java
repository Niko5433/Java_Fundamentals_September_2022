package RegexExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Furniture {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";

        Pattern pattern = Pattern.compile(regex);

        double totSum = 0.0;
        List<String> matchedFurniture = new ArrayList<>();

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                matchedFurniture.add(furniture);
                double furniturePrice = price * quantity;
                totSum += furniturePrice;

            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        matchedFurniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totSum);
    }
}
