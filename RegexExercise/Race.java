package RegexExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namesParticipants = scanner.nextLine();
        List<String> participantsList = Arrays.stream(namesParticipants.split(", ")).toList();

        Map<String, Integer> racerNames = new LinkedHashMap<>();
        participantsList.forEach(name -> racerNames.put(name, 0));

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDigits = "[0-9]";
        Pattern patternDigits = Pattern.compile(regexDigits);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder names = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);

            while (matcherLetters.find()) {
                names.append(matcherLetters.group());
            }

            int distance = 0;
            Matcher matcherDigits = patternDigits.matcher(input);
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            if (participantsList.contains(names.toString())) {
                int currentDistance = racerNames.get(names.toString());
                racerNames.put(names.toString(), currentDistance + distance);

            }

            input = scanner.nextLine();
        }
        List<String> top3Names = racerNames.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.println("1st place: " + top3Names.get(0));
        System.out.println("2nd place: " + top3Names.get(1));
        System.out.println("3rd place: " + top3Names.get(2));
    }
}
