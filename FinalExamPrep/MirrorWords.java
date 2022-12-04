package FinalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        String regex = "([@#])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textInput);
        List<String> matchedWords = new ArrayList<>();
        int wordCount = 0;

        while (matcher.find()) {
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            String reversedWordTwo = new StringBuilder(wordTwo).reverse().toString();
            wordCount++;

            if (wordOne.equals(reversedWordTwo)) {
                matchedWords.add(wordOne + " <=> " + matcher.group("wordTwo"));
            }
        }
        if (wordCount == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(wordCount + " word pairs found!");
        }
        if (matchedWords.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", matchedWords));
        }

    }
}
