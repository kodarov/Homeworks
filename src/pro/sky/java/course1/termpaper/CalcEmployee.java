package pro.sky.java.course1.termpaper;

public class CalcEmployee {
    static double sum;
    static double min;
    static double max;
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
    public static double calculationMinSalaries(Employee[] employees){
        min = employees[0].getSalary();
        for (int i = 0; i < employees.length-1; i++) {
            if (employees[i].getSalary()<min){
                min = employees[i].getSalary();
            }
        }
        return min;
    }
    public static double calculationMaxSalaries(Employee[] employees){
        max = employees[0].getSalary();
        for (int i = 0; i < employees.length-1; i++) {
            if (employees[i].getSalary()>max){
                max = employees[i].getSalary();
            }
        }
        return max;
    }
    public static double calculationAverageSalaries(Employee[] employees){
        average = calculationSumSalaries(employees) /employees.length;
        return average;
    }

}
