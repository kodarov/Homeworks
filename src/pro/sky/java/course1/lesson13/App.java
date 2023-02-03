package pro.sky.java.course1.lesson13;

public class App {
    public static void main(String[] args) {
        Author kodarovS = new Author("Салават", "Кодаров");
        Book myBook1 = new Book("Муки познания Java", kodarovS, 2022);
        myBook1.setPublicationYear(2023);

        Author volkovA = new Author("Александр", "Волков");
        Book myBook2 = new Book("Как заработать миллион$ программистУ", volkovA, 1996);

        System.out.println("\"" + myBook1.getTitle() + "\", " + myBook1.getAuthor().getFirstName() + " " + myBook1.getAuthor().getLastName() + ", " + myBook1.getPublicationYear());
        /* print lesson13 */
        System.out.println(myBook1);
        System.out.println(myBook2);
        Book myBook3 = new Book("Муки познания Java", kodarovS, 2026);
        if (myBook1.equals(myBook3)) System.out.println("Книги одинаковые");
        else System.out.println("Книги разные");


    }
}
