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
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public Employee searchEmployeeMinSalary() {
        Employee employeeMinSalary = null;
        double min = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    public Employee searchEmployeeMaxSalary() {
        Employee employeeMaxSalary = null;
        double max = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    public double calcAverageSalaries() {
        if (employees.length != 0) {
            double average = calcSumSalaries() / employees.length;
            return average;
        }
        return 0;
    }

    public void indexationSalaries(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percent / 100);
            }
        }
    }

    public Employee searchEmployeeDepMinSalary(int dep) {
        Employee employeeMinSalary = null;
        double min = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getDep() == dep && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeMinSalary = employee;
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
        if (count != 0) {
            return sum / count;
        } else return 0;
    }

    public void indexationDepSalaries(int dep, double percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDep() == dep) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * percent / 100);
            }
        }
    }

    // сложный уровень
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
        empSearch = empSearch.substring(0, 1).toUpperCase() + empSearch.substring(1).toLowerCase();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getLastName().equals(empSearch) ||
                    employees[i].getFirstName().equals(empSearch) || employees[i].getSurname().equals(empSearch)) {
                System.out.printf("УДАЛЕН %s\n", employees[i]);
                employees[i] = null;
                currentWorkers--;
            }
        }
    }

    public void removeEmployees(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && id == employees[i].getId()) {
                System.out.printf("УДАЛЕН %s\n", employees[i]);
                employees[i] = null;
            }
        }
    }

    public void removeEmployee(String empSearch, int id) {
        empSearch = empSearch.substring(0, 1).toUpperCase() + empSearch.substring(1).toLowerCase();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getLastName().equals(empSearch) ||
                    employees[i].getFirstName().equals(empSearch) ||
                    employees[i].getSurname().equals(empSearch) && id == employees[i].getId()) {
                System.out.printf("УДАЛЕН %s\n", employees[i]);
                employees[i] = null;
                currentWorkers--;
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
