package pro.sky.java.course1.termpaper;

public class EmployeeBook {
    private Employee[] employee;
    private static int currentPages;
    private final int pages;

    public EmployeeBook(int pages) {
        this.pages=pages;
        employee = new Employee[pages];
    }

    public void addEmployee(Employee employee){
        this.employee[currentPages] = employee;
        currentPages++;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public int getPage() {
        return pages;
    }

    public void printEmployeeBook(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public double calcSumSalaries(Employee[] employees) {
        double sum = 0;
        for (Employee i : employees) {
            sum = sum + i.getSalary();
        }
        return sum;
    }

    public Employee searchEmployeeMinSalary(Employee[] employees) {
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

    public Employee searchEmployeeMaxSalary(Employee[] employees) {
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

    public double calcAverageSalaries(Employee[] employees) {
        double average = calcSumSalaries(employees) / employees.length;
        return average;
    }

    public void printEmployeeBookMini(Employee[] employees) {
        for (Employee i : employees) {
            System.out.printf("\n %s %s %s ", i.getLastName(), i.getFirstName(), i.getSurname());
        }
    }

    public void indexationSalaries(Employee[] employees, double percent){
        for (Employee i : employees) {
            i.setSalary(i.getSalary()+i.getSalary()*percent/100);
        }
    }

    public Employee searchEmployeeDepMinSalary(Employee[] employees, int dep) {
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

    public Employee searchEmployeeDepMaxSalary(Employee[] employees, int dep) {
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
    public double calcSumDepSalaries(Employee[] employees, int dep){
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep){
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }
    public double calcAverageDepSalaries(Employee[] employees, int dep) {
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
    public void indexationDepSalaries(Employee[] employees, int dep, double percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * percent / 100);
            }
        }
    }
    //Перезагрузка метода
    public void printEmployeeBookMini(Employee[] employees,int dep){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep) {
                System.out.printf("\n %s %s %s ", employees[i].getLastName(), employees[i].getFirstName(), employees[i].getSurname());
            }
        }
    }

    public void printEmpSalariesMore (Employee[] employees, double moreSalary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= moreSalary) {
                System.out.printf("Работник id:%d: %s %s %s, зарплата: %.2f руб.\n"
                        , employees[i].getId(), employees[i].getLastName(), employees[i].getFirstName()
                        , employees[i].getSurname(), employees[i].getSalary());
            }
        }
    }
    public void printEmpSalariesLess (Employee[] employees, double lessSalary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < lessSalary) {
                System.out.printf("Работник id:%d: %s %s %s, зарплата: %.2f руб.\n"
                        , employees[i].getId(), employees[i].getLastName(), employees[i].getFirstName()
                        , employees[i].getSurname(), employees[i].getSalary());
            }
        }
    }
}
