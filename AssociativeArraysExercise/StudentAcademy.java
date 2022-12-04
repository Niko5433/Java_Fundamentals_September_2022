package AssociativeArraysExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGradeMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGradeMap.containsKey(studentName)) {
                studentsGradeMap.put(studentName, new ArrayList<>());
            }
            studentsGradeMap.get(studentName).add(grade);

        }
        Map<String, Double> averageGradesMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsGradeMap.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double averageGrade = getAverageGrade(listGrades);

            if (averageGrade >= 4.5) {
                averageGradesMap.put(studentName, averageGrade);
            }
        }
        averageGradesMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> listGrades) {
        double gradesSum = 0;

        for (double grade : listGrades) {
            gradesSum += grade;
        }
        return gradesSum / listGrades.size();
    }
}
