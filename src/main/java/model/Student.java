package model;

// OBJECT
public class Student {
    // PROPERTIES
    private String firstName;
    private String lastName;
    private String email;
    private int age;
// END OF PROPERTIES

    // CONSTRUCTOR
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {}

    // STANDARD METHODS (GETTERS / SETTERS)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // CUSTOM METHODS
    public String getFullName() {
        return firstName + " " + lastName;

    }

    public void printFullInfo() {
        System.out.println("----------------------");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Email address: " + email);
        System.out.println("Age: " + age);
        System.out.println("----------------------");

    }

}
