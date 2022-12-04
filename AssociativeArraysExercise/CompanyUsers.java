package AssociativeArraysExercise;

import java.util.*;
import java.util.stream.Collectors;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> employeeMap = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if (employeeMap.containsKey(company)) {
                List<String> employees = employeeMap.get(company);
                if (!employees.contains(employeeId))
                    employees.add(employeeId);
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employeeId);
                employeeMap.put(company, employees);
            }
            input = scanner.nextLine();
        }
        employeeMap.entrySet().forEach(company -> {
                    System.out.println(company.getKey());
                    company.getValue().forEach(employee -> System.out.println("-- " + employee));
                });
    }
}
