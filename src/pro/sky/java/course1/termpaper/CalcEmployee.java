package pro.sky.java.course1.termpaper;



public class CalcEmployee {
    static double sum;
    static double min;
    static Employee employeeMinSalary;
    static double max;
    static  Employee employeeMaxSalary;
    static double average;
    public static void printEmployeeBook(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
    public static double calculationSumSalaries(Employee[] employees){
        for (Employee i : employees) {
            sum = sum + i.getSalary();
        }
        return sum;
    }
    public static Employee searchEmployeeMinSalary(Employee[] employees){
        min = employees[0].getSalary();
        for (int i = 0; i < employees.length-1; i++) {
            if (employees[i].getSalary()<min){
                min = employees[i].getSalary();
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary;
    }
    public static Employee searchEmployeeMaxSalary(Employee[] employees){
        max = employees[0].getSalary();
        for (int i = 0; i < employees.length-1; i++) {
            if (employees[i].getSalary()>max){
                max = employees[i].getSalary();
                employeeMaxSalary = employees[i];
            }
        }
        return employeeMaxSalary;
    }
    public static double calculationAverageSalaries(Employee[] employees){
        average = calculationSumSalaries(employees) /employees.length;
        return average;
    }

    public static void printEmployeeBookMini(Employee[] employees) {
        for (Employee i : employees) {
            System.out.printf("%s %s %s \n", i.getLastName(), i.getFirstName(), i.getSurname());
        }
    }

}
