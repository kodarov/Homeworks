package pro.sky.java.course1.termpaper;


public class CalcEmployee {
    public static void printEmployeeBook(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static double calcSumSalaries(Employee[] employees) {
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

    public static double calcAverageSalaries(Employee[] employees) {
        double average = calcSumSalaries(employees) / employees.length;
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

    public static void indexationSalaries(Employee[] employees, double percent){
        for (Employee i : employees) {
            i.setSalary(i.getSalary()+i.getSalary()*percent/100);
        }
    }

    public static Employee searchEmployeeDepMinSalary(Employee[] employees, int dep) {
        Employee employeeMinSalary = null;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].getDep() == dep && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeMinSalary = employees[i];
            }
        }
        return employeeMinSalary;
    }

    public static Employee searchEmployeeDepMaxSalary(Employee[] employees, int dep) {
        Employee employeeMaxSalary = null;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].getDep() == dep && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employeeMaxSalary = employees[i];
            }
        }
        return employeeMaxSalary;
    }
    public static double calcSumDepSalaries(Employee[] employees, int dep){
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep){
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }
    public static double calcAverageDepSalaries(Employee[] employees, int dep) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep){
                sum += employees[i].getSalary();
                count++;
            }
        }
        return sum/count;
    }
    public static void indexationDepSalaries(Employee[] employees, int dep, double percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * percent / 100);
            }
        }
    }
    //Перезагрузка метода
    public static void printEmployeeBookMini(Employee[] employees,int dep){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep) {
                System.out.printf("\n %s %s %s ", employees[i].getLastName(), employees[i].getFirstName(), employees[i].getSurname());
            }
        }
    }

    public static void printEmpSalariesMore (Employee[] employees, double moreSalary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= moreSalary) {
                System.out.printf("Работник id:%d: %s %s %s, зарплата: %.2f руб.\n"
                        , employees[i].getId(), employees[i].getLastName(), employees[i].getFirstName()
                        , employees[i].getSurname(), employees[i].getSalary());
            }
        }
    }
    public static void printEmpSalariesLess (Employee[] employees, double lessSalary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < lessSalary) {
                System.out.printf("Работник id:%d: %s %s %s, зарплата: %.2f руб.\n"
                        , employees[i].getId(), employees[i].getLastName(), employees[i].getFirstName()
                        , employees[i].getSurname(), employees[i].getSalary());
            }
        }
    }
}
