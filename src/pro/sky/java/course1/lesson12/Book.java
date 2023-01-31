package pro.sky.java.course1.lesson12;

public class Book {
   private final String title;
   private Author author;
   private final int publicationYear;
   private final String authorFirstName;
   private final String authorLastname;
   public Book(String title, Author author,int publicationYear){
      this.title = title;
      this.publicationYear=publicationYear;
      this.authorFirstName=author.getFirstName();
      this.authorLastname=author.getLastName();
   }

}
