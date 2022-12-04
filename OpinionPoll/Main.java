package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int rows = 1; rows <= n ; rows++) {
            String currentData = scanner.nextLine();
            String name = currentData.split(" ")[0];
            int age = Integer.parseInt(currentData.split(" ")[1]);

            if (age > 30){
                Person person = new Person(name,age);
                personList.add(person);
            }
        }
        for (Person data:personList) {
            System.out.println(data.getName() + " - " + data.getAge());
        }
    }
}
