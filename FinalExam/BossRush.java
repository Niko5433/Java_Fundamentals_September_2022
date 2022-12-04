package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = Integer.parseInt(scanner.nextLine());
        String regex = "\\|(?<name>[A-Z]{4,})\\|:#(?<job>[A-Za-z]+ [A-Za-z]+)#";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < inputs; i++) {
            String boss = scanner.nextLine();
            Matcher matcher = pattern.matcher(boss);
            if(matcher.find()){
                String name = matcher.group("name");
                String job = matcher.group("job");

                System.out.println(name + ", The " + job);
                System.out.println(">> Strength: " + name.length());
                System.out.println(">> Armor: " + job.length());

            } else {
                System.out.println("Access denied!");
            }
        }
    }
}
