package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataInput = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!dataInput.equals("End")) {
            String name = dataInput.split(" ")[0];
            String identityNumber = dataInput.split(" ")[1];
            int age = Integer.parseInt(dataInput.split(" ")[2]);

            Person person = new Person(name, identityNumber, age);

            personList.add(person);

            dataInput = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person human:personList) {
            System.out.printf("%s with ID: %s is %s years old.%n", human.getName(), human.getIdentityNumber(),human.getAge());
        }
    }
}
