package pro.sky.java.course1.termpaper;

import java.util.Objects;

public class Employee {
    private final String lastName;
    private final String firstName;
    private final String surname;
    private static int count = 0;
    private double salary;
    private int dep;

    public Employee(String lastName, String firstName, String surname, int dep, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.dep = dep;
        this.salary = salary;
        count++;
    }
    public Employee(String lastName, String firstName, String surname) {
this(lastName,firstName,surname,0, 0L);
    }

    public static int getCount() {
        return count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurname() {
        return surname;
    }

    public int getDep() {
        return dep;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(lastName, employee.lastName) && Objects.equals(firstName, employee.firstName) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, surname);
    }

    @Override
    public String toString() {
        return "Работник: " + lastName + " " + firstName + " " + surname +
                ", отдел: " + dep +
                ", зарплата: " + salary + " руб";
    }
}
