package HOME_TASKS.Lesson_8;

import Infrastructure.Utils.Utils;

public class LibApp {
  public static void main(String[] args) {
    Author author = new Author("John", "Man");
    Author author2 = new Author("John", "Man");
    System.out.println(author.equals(author2));

    Book myBook = new Book("" + Utils.randomFromRange(0, 10), "Mumu", author, "1900", "Story", "0000");
    System.out.println(myBook.getId());
    System.out.println(myBook.toString());

    Book myBook2 = new Book("Mumu", author, "1900", "Story", "0000");
    System.out.println(myBook2.toString());

    Book myBook3 = new Book();
    System.out.println(myBook3);

    Book myBook4 = new Book("234", "Mumu", author, "1900", "Story", "0000");
    System.out.println(myBook4);


    System.out.println(myBook.equals(myBook4));

    System.out.println(myBook.equals(myBook2));



  }
}
