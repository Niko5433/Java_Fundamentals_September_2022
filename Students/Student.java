package Students;

public class Student {

    //Lakia Eason 3.90

    private String firstName;
    private String lastName;
    private double grade;


    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public double getGrade() {
        return this.grade;
    }


}
