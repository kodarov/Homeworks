package pro.sky.java.course1.termpaper;


public class CalcEmployee {
    public static void printEmployeeBook(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static double calculationSumSalaries(Employee[] employees) {
        double sum = 0;
        for (Employee i : employees) {
            sum = sum + i.getSalary();
        }
        return sum;
    }

    public static Employee searchEmployeeMinSalary(Employee[] employees) {
        Employee employeeMinSalary = null;
        double min = employees[0].getSalary();
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary;
    }

    public static Employee searchEmployeeMaxSalary(Employee[] employees) {
        Employee employeeMaxSalary = null;
        double max = employees[0].getSalary();
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeMaxSalary = employees[i];
            }
        }
        return employeeMaxSalary;
    }

    public static double calculationAverageSalaries(Employee[] employees) {
        double average = calculationSumSalaries(employees) / employees.length;
        return average;
    }

    public static void printEmployeeBookMini(Employee[] employees) {
        for (Employee i : employees) {
            System.out.printf("\n %s %s %s ", i.getLastName(), i.getFirstName(), i.getSurname());
        }
    }
    public static int getCount()
    {
        return Employee.getCount();
    }

}
