package pro.sky.java.course1.termpaper;

public class Main {
    static Employee[] employee =new Employee[10];
    public static void main(String[] args) {
        employee[0] = new Employee("Кодаров","Салават", "Саламатович",5,55000);
        employee[1] = new Employee("Ермилов","Александр", "Владимирович",5,65000);
        employee[2] = new Employee("Измайлов","Марат", "Дамирович",2,102000);
        employee[3] = new Employee("Миронов","Андрей", "Александрович",1,150000);
        employee[4] = new Employee("Волков","Валерий", "Валерьевич",4,75000);
        employee[5] = new Employee("Роднов","Дмитрий", "Алексеевич",5,50000);
        employee[6] = new Employee("Касьянов","Роман", "Романович",2,120000);
        employee[7] = new Employee("Никель","Дмитрий", "Степанович",3,85000);
        employee[8] = new Employee("Игнатьев","Константин", "Ювельевич",1,155000);
        employee[9] = new Employee("Андрианов","Дмитрий", "Иванович",3,80000);

    }
}
