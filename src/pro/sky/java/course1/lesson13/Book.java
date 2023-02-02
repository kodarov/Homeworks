package pro.sky.java.course1.lesson13;

import java.util.Objects;

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

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Book book = (Book) o;
      return Objects.equals(title, book.title) && Objects.equals(author, book.author);
   }

   @Override
   public int hashCode() {
      return Objects.hash(title, author);
   }

   @Override
   public String toString() {
      return "Название: '" + title + '\'' +
              ", автор " + author +
              ", год публикации " + publicationYear;
   }
}
