package pro.sky.java.course1.termpaper;

import java.util.Objects;

public class Employee {
    private final String lastName;
    private final String firstName;
    private final String surname;
    private static int count;
    private final int id;
    private double salary;
    private int dep;

    public Employee(String lastName, String firstName, String surname, int dep, double salary) {
        if (lastName.trim().isEmpty() || firstName.trim().isEmpty() || surname.trim().isEmpty()) {
            throw new RuntimeException("Отсутствуют полные данные Ф.И.О!");
        }
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);
        this.lastName = lastName;
        this.firstName = firstName;
        this.surname = surname;

        if (salary < 0) {
            this.salary = 0;
        } else this.salary = salary;


        if (dep > 0 && dep < 6) {
            this.dep = dep;
        } else this.dep = 0;

        this.id = ++count;
    }

    public Employee(String lastName, String firstName, String surname) {
        this(lastName, firstName, surname, 0, 0L);
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

    public double getSalary() {
        return salary;
    }

    public int getDep() {
        return dep;
    }

    public void setDep(int dep) {
        if (dep > 0 && dep < 6) this.dep = dep;
        else this.dep = 0;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0;
        } else this.salary = salary;
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
        return String.format("Работник id:%d: %s %s %s, отдел: %d, зарплата: %.2f руб."
                , id, lastName, firstName, surname, dep, salary);
    }
}
