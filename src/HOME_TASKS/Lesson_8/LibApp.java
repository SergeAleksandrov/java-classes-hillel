package HOME_TASKS.Lesson_8;

public class LibApp {
  public static void main(String[] args) {
    Author author = new Author("John", "Man");
    Book bookMy = new Book("234", "Mumu", author, "1900", "Story", "0000");
    System.out.println(bookMy.getId());
    System.out.println(bookMy.toString());

    Book bookMy2 = new Book("Mumu", author, "1900", "Story", "0000");
    System.out.println(bookMy2.toString());

    Book bookMy3 = new Book();
    System.out.println(bookMy3);

  }
}
