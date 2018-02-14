package HOME_TASKS.Lesson_8;

import java.util.UUID;

public class Book {

  private String id;
  private String title;
  private String author;
  private String year;
  private String description;
  private String isbn;

  public Book(String id, String title, String author, String year, String description, String isbn){
    this.id = id;
    this.title = title;
    this.author = author;
    this.year = year;
    this. description = description;
    this.isbn = isbn;
  }
        // Вызов одного конструктора из другого (из Book вызывается Book)
  public Book(String title, String author, String year, String description, String isbn) {
    this(UUID.randomUUID().toString(), title, author, year, description, isbn);
  }

  // Initialisation block (используется для задания начальных значений при вызове default constructor

  public Book(){};  //  default constructor

  {  id = "123";
     title = "dfdf";
     author = "dfdf";            //   Initialisation block
     year = "1234";
     description = "fdf";
     isbn = "dfgdf";
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public String toString() {
    return "Book{" + "id='" + id + '\'' + ", title='" + title + '\'' + ", author='" + author + '\'' + ", year='" + year + '\'' + ", description='" + description + '\'' + ", isbn='" + isbn + '\'' + '}';
  }
}
