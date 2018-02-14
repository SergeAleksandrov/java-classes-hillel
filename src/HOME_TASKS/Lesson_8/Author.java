package HOME_TASKS.Lesson_8;

public class Author {
  String name;
  String lastname;

  public Author(String name, String lastname) {
    this.name = name;
    this.lastname = lastname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  @Override
  public String toString() {
    return "Author{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + '}';
  }
}
