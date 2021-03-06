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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Author author = (Author) o;

    if (!name.equals(author.name)) return false;
    return lastname.equals(author.lastname);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + lastname.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Author{" + "name='" + name + '\'' + ", lastname='" + lastname + '\'' + '}';
  }
}
