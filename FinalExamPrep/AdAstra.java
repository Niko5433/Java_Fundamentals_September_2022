package FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine(); //текст с информация
        String regex = "(#|\\|)(?<foodName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex); //шаблон
        Matcher matcher = pattern.matcher(text);

        int totalCalories = 0;

        StringBuilder outputItems = new StringBuilder();

        while (matcher.find()) {
            String foodName = matcher.group("foodName"); //"Bread"
            String expDate = matcher.group("expirationDate"); //"19/03/21"
            int calories = Integer.parseInt(matcher.group("calories")); //"4000" -> 4000

            totalCalories += calories;
            outputItems.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", foodName, expDate, calories));
        }

        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        System.out.println(outputItems);
    }
}
