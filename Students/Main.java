package Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String studentData = scanner.nextLine();

            String firstName = studentData.split("\\s+")[0];
            String lastName = studentData.split("\\s+")[1];
            double grade = Double.parseDouble(studentData.split("\\s+")[2]);

            Student student = new Student(firstName,lastName,grade);

            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());


        for (Student student:studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(),student.getLastName(),student.getGrade());
        }
    }
}
