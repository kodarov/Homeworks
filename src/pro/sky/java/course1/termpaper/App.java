package pro.sky.java.course1.termpaper;

public class App {


    public static void main(String[] args) {
        EmployeeBook buhBook = new EmployeeBook(0);
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
        Employee worker11 = new Employee("Андрианова", "Марина", "Ивановна", 2, 80000);
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
        buhBook.addEmployee(worker11);

        buhBook.printEmployeeBook();
        System.out.println("Сумма ЗП " + buhBook.calcSumSalaries());
        System.out.printf("Работник с минимальной ЗП %s \n", buhBook.searchEmployeeMinSalary());
        System.out.printf("Работник с максимальная ЗП %s \n", buhBook.searchEmployeeMaxSalary());
        System.out.printf("Среднее ЗП %.2f \n", buhBook.calcAverageSalaries());
        buhBook.printEmployeeBookMini();
        System.out.println("\n----- Всего сотрудников " + Employee.getCount());
        System.out.println("\n----- Всего сотрудников в книге " + EmployeeBook.getCurrentPages());
        //повышенная сложность
        System.out.println("\n-----------Индексация 10,5%----------");
        buhBook.indexationSalaries(10.5);
        buhBook.printEmployeeBook();
        System.out.printf("\nСотрудник отдела с минимальной ЗП: %s", buhBook.searchEmployeeDepMinSalary(2));
        System.out.printf("\nСотрудник отдела с максимальной ЗП: %s", buhBook.searchEmployeeDepMaxSalary(2));
        System.out.printf("\nСумма ЗП по отделу: %s", buhBook.calcSumDepSalaries(2));
        System.out.printf("\nСреднее ЗП по отделу: %.2f", buhBook.calcAverageDepSalaries(2));
        System.out.print("\n------------Индексация 20.5% ЗП отдела -------------");
        buhBook.indexationDepSalaries(2,20.5);
        buhBook.printEmployeeBook(2);
        System.out.println();
        System.out.println("\n-------------Больше введенного числа-----------------");
        buhBook.printEmpSalariesMore(75_000);
        System.out.println("\n-------------Меньше введенного числа------------------");
        buhBook.printEmpSalariesLess(100_000);

        // сложная часть
        System.out.println("\n-------------УДАЛЕНИЕ------------------");
        buhBook.removeEmployee("Кодаров Салават Саламатович");
        buhBook.removeEmployees(6);
        buhBook.removeEmployee("Миронов Андрей Александрович",4);
        System.out.println("----- Всего сотрудников в книге " + EmployeeBook.getCurrentPages());
        buhBook.printEmployeeBook();
    }
}
