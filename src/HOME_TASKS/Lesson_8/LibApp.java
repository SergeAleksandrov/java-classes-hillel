package HOME_TASKS.Lesson_8;

public class LibApp {
  public static void main(String[] args) {
    Book bookMy = new Book("234", "Mumu", "Turgenev", "1900", "Story", "0000");
    System.out.println(bookMy.getId());
    System.out.println(bookMy.toString());

    Book bookMy2 = new Book("Mumu", "Turgenev", "1900", "Story", "0000");
    System.out.println(bookMy2.toString());

    Book bookMy3 = new Book();
    System.out.println(bookMy3);

  }
}
