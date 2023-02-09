package pro.sky.java.course1.termpaper;

public class App {


    public static void main(String[] args) {
        EmployeeBook buhBook = new EmployeeBook(10);
        Employee kodarovSS = new Employee("кодаров", "салават", "саламатович", -32, 55000.45);
        buhBook.addEmployee(kodarovSS);

/*        employee[0] = new Employee("кодаров", "салават", "саламатович", -32, 55000.45);
        employee[1] = new Employee("Ермилов", "Александр", "Владимирович", 2, 65000);
        employee[2] = new Employee("Измайлов", "Марат", "Дамирович", 2, 102000.33);
        employee[3] = new Employee("Миронов", "Андрей", "Александрович", 1, 150000);
        employee[4] = new Employee("Волков", "Валерий", "Валерьевич", 4, 75000);
        employee[5] = new Employee("Роднов", "Дмитрий", "Алексеевич", 5, 50000.99);
        employee[6] = new Employee("Касьянов", "Роман", "Романович", 2, 120000);
        employee[7] = new Employee("Никель", "Дмитрий", "Степанович", 3, 85000);
        employee[8] = new Employee("Игнатьев", "Константин", "Ювельевич", 1, 155000);
        employee[9] = new Employee("Андрианов", "Дмитрий", "Иванович", 2, 80000);
        CalcEmployee.printEmployeeBook(employee);
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
