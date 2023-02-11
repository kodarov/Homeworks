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
        }
    }

    public void printEmployeeBook(int dep) {
        for (Employee employee : employees) {
            if (employee.getDep() == dep) {
                System.out.printf("\nРаботник id:%d %s %s %s, зарплата: %.2f руб. "
                        , employee.getId(), employee.getLastName(), employee.getFirstName(),
                        employee.getSurname(), employee.getSalary());
            }
        }
    }

    public void printEmployeeBookMini() {
        for (Employee i : employees) {
            System.out.printf("\n %s %s %s ", i.getLastName(), i.getFirstName(), i.getSurname());
        }
    }

    public void printEmployeeBookMini(int dep) {
        for (Employee employee:employees) {
            if (employee.getDep() == dep) {
                System.out.printf("\n %s %s %s ", employee.getLastName(), employee.getFirstName(), employee.getSurname());
            }
        }
    }

    public void printEmpSalariesMore(double moreSalary) {
        for (Employee employee:employees) {
            if (employee.getSalary() >= moreSalary) {
                System.out.printf("Работник id:%d: %s %s %s, зарплата: %.2f руб.\n"
                        , employee.getId(), employee.getLastName(), employee.getFirstName()
                        , employee.getSurname(), employee.getSalary());
            }
        }
    }

    public void printEmpSalariesLess(double lessSalary) {
        for (Employee employee:employees) {
            if (employee.getSalary() < lessSalary) {
                System.out.printf("Работник id:%d: %s %s %s, зарплата: %.2f руб.\n"
                        , employee.getId(), employee.getLastName(), employee.getFirstName()
                        , employee.getSurname(), employee.getSalary());
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
            return calcSumSalaries() / employees.length;
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
        for (Employee employee : employees) {
            if (employee != null && employee.getDep() == dep && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    public double calcSumDepSalaries(int dep) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDep() == dep) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double calcAverageDepSalaries(int dep) {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDep() == dep) {
                sum += employee.getSalary();
                count++;
            }
        }
        if (count != 0) {
            return sum / count;
        } else return 0;
    }

    public void indexationDepSalaries(int dep, double percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDep() == dep) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percent / 100);
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
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFIO().equals(empSearch)) {
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
                currentWorkers--;
            }
        }
    }

    public void removeEmployee(String empSearch, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (id == employees[i].getId() && employees[i].getFIO().equals(empSearch)) {
                    System.out.printf("УДАЛЕН %s\n", employees[i]);
                    employees[i] = null;
                    currentWorkers--;
                }
            }
        }
    }

}
