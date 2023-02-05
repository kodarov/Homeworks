package pro.sky.java.course1.termpaper;

public class CalcEmployee {
    static double sum;
    public static void printEmployeeBook(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
    public static double calcSalariesAll(Employee[] employees){
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

}
