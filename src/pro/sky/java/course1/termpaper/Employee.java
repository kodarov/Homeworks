package pro.sky.java.course1.termpaper;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String surname;
    private double salary;
    private int departament;

    public Employee(String lastName, String firstName, String surname, int departament, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
    }
}
