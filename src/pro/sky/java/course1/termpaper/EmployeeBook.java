package pro.sky.java.course1.termpaper;

public class EmployeeBook {
    private static Employee[] employees;
    private static int currentWorkers;
    private final int pages;

    public EmployeeBook(int pages) {
        this.pages = pages;
        employees = new Employee[pages];
    }

    public Employee[] getEmployee() {
        return employees;
    }

    public int getPage() {
        return pages;
    }

    public static int getCurrentPages() {
        return currentWorkers;
    }

    public void printEmployeeBook() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
            continue;
        }
    }

    public void printEmployeeBook(int dep) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep) {
                System.out.printf("\nРаботник id:%d %s %s %s, зарплата: %.2f руб. "
                        , employees[i].getId(), employees[i].getLastName(), employees[i].getFirstName(),
                        employees[i].getSurname(), employees[i].getSalary());
            }
        }
    }

    public void printEmployeeBookMini() {
        for (Employee i : employees) {
            System.out.printf("\n %s %s %s ", i.getLastName(), i.getFirstName(), i.getSurname());
        }
    }

    public void printEmployeeBookMini(int dep) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep) {
                System.out.printf("\n %s %s %s ", employees[i].getLastName(), employees[i].getFirstName(), employees[i].getSurname());
            }
        }
    }

    public void printEmpSalariesMore(double moreSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= moreSalary) {
                System.out.printf("Работник id:%d: %s %s %s, зарплата: %.2f руб.\n"
                        , employees[i].getId(), employees[i].getLastName(), employees[i].getFirstName()
                        , employees[i].getSurname(), employees[i].getSalary());
            }
        }
    }

    public void printEmpSalariesLess(double lessSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < lessSalary) {
                System.out.printf("Работник id:%d: %s %s %s, зарплата: %.2f руб.\n"
                        , employees[i].getId(), employees[i].getLastName(), employees[i].getFirstName()
                        , employees[i].getSurname(), employees[i].getSalary());
            }
        }
    }

    public double calcSumSalaries() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public Employee searchEmployeeMinSalary() {
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

    public Employee searchEmployeeMaxSalary() {
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

    public double calcAverageSalaries() {
        double average = calcSumSalaries() / employees.length;
        return average;
    }

    public void indexationSalaries(double percent) {
        for (Employee i : employees) {
            i.setSalary(i.getSalary() + i.getSalary() * percent / 100);
        }
    }

    public Employee searchEmployeeDepMinSalary(int dep) {
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

    public Employee searchEmployeeDepMaxSalary(int dep) {
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

    public double calcSumDepSalaries(int dep) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public double calcAverageDepSalaries(int dep) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep) {
                sum += employees[i].getSalary();
                count++;
            }
        }
        return sum / count;
    }

    public void indexationDepSalaries(int dep, double percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * percent / 100);
            }
        }
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                currentWorkers++;
                break;
            }
        }
    }

    public void removeEmployee(String empSearch) {
        empSearch = empSearch.substring(0, 1).toUpperCase() + empSearch.substring(1);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getLastName().equals(empSearch) ||
                    employees[i].getFirstName().equals(empSearch) || employees[i].getSurname().equals(empSearch)) {
                System.out.printf("УДАЛЕН %s\n", employees[i]);
                employees[i] = null;
                currentWorkers--;
            }
        }
    }
    public void removeEmployee(String empSearch, int id) {
        empSearch = empSearch.substring(0, 1).toUpperCase() + empSearch.substring(1);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getLastName().equals(empSearch) ||
                    employees[i].getFirstName().equals(empSearch) ||
                    employees[i].getSurname().equals(empSearch) && id == employees[i].getId()) {
                System.out.printf("УДАЛЕН %s\n", employees[i]);
                employees[i] = null;
                currentWorkers--;
            }
        }
    }
    public void removeEmployees(int id){
        for (int i = 0; i < employees.length; i++) {
           if (id == employees[i].getId()) {
               employees[i] = null;
           }
        }
    }


/*    public void addEmployee(Employee employee) {
        if (currentPages < pages) {
            this.employees[currentPages] = employee;
            currentPages++;
        } else throw new RuntimeException("Книга заполнена!");
    }*/
}
