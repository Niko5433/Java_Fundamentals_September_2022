package ObjectsAndClassesLab;

import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    //John Smith 15 Sofia
    static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String city;

        public Student(String firstName, String lastName, String age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getCity() {
            return this.city;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentInput = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();

        while (!studentInput.equals("end")) {
            String[] studentInputArr = studentInput.split("\\s+");

            Student currentStudent = new Student(studentInputArr[0], studentInputArr[1], studentInputArr[2], studentInputArr[3]);
            studentList.add(currentStudent);

            studentInput = scanner.nextLine();
        }

        String citySelect = scanner.nextLine();
        for (Student student:studentList) {
            if (student.getCity().equals(citySelect)){
                System.out.printf("%s %s is %s years old%n", student.getFirstName(),student.getLastName(), student.getAge() );
            }
        }
    }
}
