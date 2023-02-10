package pro.sky.java.course1.termpaper;

public class App {


    public static void main(String[] args) {
        EmployeeBook buhBook = new EmployeeBook(10);
        Employee worker1 = new Employee("кодаров", "салават", "саламатович", -32, 55000.45);
        Employee worker2 = new Employee("Ермилов", "Александр", "Владимирович", 2, 65000);
        Employee worker3 = new Employee("Измайлов", "Марат", "Дамирович", 2, 102000.33);
        Employee worker4 = new Employee("Миронов", "Андрей", "Александрович", 1, 150000);
        Employee worker5 = new Employee("Волков", "Валерий", "Валерьевич", 4, 75000);
        Employee worker6 = new Employee("Роднов", "Дмитрий", "Алексеевич", 5, 50000.99);
        Employee worker7 = new Employee("Касьянов", "Роман", "Романович", 2, 120000);
        Employee worker8 = new Employee("Никель", "Дмитрий", "Степанович", 3, 85000);
        Employee worker9 = new Employee("Игнатьев", "Константин", "Ювельевич", 1, 155000);
        Employee worker10 = new Employee("Андрианов", "Дмитрий", "Иванович", 2, 80000);
        buhBook.addEmployee(worker1);
        buhBook.addEmployee(worker2);
        buhBook.addEmployee(worker3);
        buhBook.addEmployee(worker4);
        buhBook.addEmployee(worker5);
        buhBook.addEmployee(worker6);
        buhBook.addEmployee(worker7);
        buhBook.addEmployee(worker8);
        buhBook.addEmployee(worker9);
        buhBook.addEmployee(worker10);
        buhBook.printEmployeeBook(buhBook.getEmployee());

        buhBook.printEmployeeBook();
/*


        System.out.println(CalcEmployee.calcSumSalaries(employee));
        System.out.println(CalcEmployee.searchEmployeeMinSalary(employee));
        System.out.println(CalcEmployee.searchEmployeeMaxSalary(employee));
        System.out.printf("%.2f", CalcEmployee.calcAverageSalaries(employee));
        CalcEmployee.printEmployeeBookMini(employee);
        System.out.println("\n Всего сотрудников " + CalcEmployee.getCount());
        // повышенная сложность
        System.out.println("Индексация 10,5%");
        CalcEmployee.indexationSalaries(employee,10.5);
        CalcEmployee.printEmployeeBook(employee);

        System.out.println("Сотрудник отдела с минимальной ЗП:");
        System.out.println(CalcEmployee.searchEmployeeDepMinSalary(employee, 2));

        System.out.println("Сотрудник отдела с максимальной ЗП:");
        System.out.println(CalcEmployee.searchEmployeeDepMaxSalary(employee, 2));

        System.out.print("Сумма ЗП по отделу: ");
        System.out.printf("%.2f \n", CalcEmployee.calcSumDepSalaries(employee, 2));

        System.out.print("Среднее ЗП по отделу: ");
        System.out.printf("%.2f \n", CalcEmployee.calcAverageDepSalaries(employee, 2));

        System.out.println("Индексация 20.5%");
        CalcEmployee.indexationDepSalaries(employee,2,20.5);
        CalcEmployee.printEmployeeBookMini(employee,2);
        System.out.println();
        System.out.println();
        System.out.println("Больше введенного числа");
        CalcEmployee.printEmpSalariesMore(employee,75_000);
        System.out.println();
        System.out.println("Меньше введенного числа");
        CalcEmployee.printEmpSalariesLess(employee,100_000);*/


    }
}
