package pro.sky.java.course1.lesson13;

public class Book {
   private final String title;
   private final Author author;
   private int publicationYear;
   public Book(String title, Author author, int publicationYear){
      this.title = title;
      this.publicationYear=publicationYear;
      this.author = author;
   }

   public String getTitle() {
      return title;
   }

   public Author getAuthor() {
      return author;
   }

   public int getPublicationYear() {
      return publicationYear;
   }

   public void setPublicationYear(int publicationYear) {
      this.publicationYear = publicationYear;
   }
}
