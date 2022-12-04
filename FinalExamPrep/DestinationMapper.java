package FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destinationInput = scanner.nextLine();

        String regex = "([=\\/])(?<destination>[A-Z][A-za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(destinationInput);
        List<String> destinationList = new ArrayList<>();
        int points = 0;

        while (matcher.find()){
            String destination = matcher.group("destination");
            points += destination.length();
            destinationList.add(destination);
        }

        String destinations = String.join(", ", destinationList);
        System.out.println("Destinations: " + destinations);
        System.out.println("Travel Points: " + points);
    }
}
