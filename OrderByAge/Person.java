package OrderByAge;

public class Person {

    //George 123456 20
    private String name;
    private String identityNumber;
    private int age;


    public Person(String name, String identityNumber, int age) {
        this.name = name;
        this.identityNumber = identityNumber;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public int getAge() {
        return this.age;
    }
}
