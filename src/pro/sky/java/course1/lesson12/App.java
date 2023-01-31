package pro.sky.java.course1.lesson12;

public class App {
    public static void main(String[] args) {
Author kodarovS = new Author("Салават","Кодаров");
Book myBook1 = new Book("Муки познания Java",kodarovS,2022);
myBook1.setPublicationYear(2023);

Author volkovA = new Author("Александр","Волков");
Book myBook2 = new Book("Как заработать миллион$ программистом",volkovA, 1996);
    }
}
