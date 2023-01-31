package pro.sky.java.course1.lesson12;

public class App {
    public static void main(String[] args) {
Author kodarov = new Author("Салават","Кодаров");
Book myBook = new Book("Познание в муках",kodarov,2022);
myBook.setPublicationYear(2023);
        //System.out.println(myBook.getTitle()+" "+myBook.getAuthor().getFirstName() + " " + myBook.getPublicationYear());
    }
}
