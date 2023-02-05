package pro.sky.java.course1.termpaper;

public class CalcEmployee {
    static double sum;
    public static void printEmployeeBook(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
    public static double calcSalariesAll(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
           sum = sum + employees[i].getSalary();
        }
        return sum;
    }

}
