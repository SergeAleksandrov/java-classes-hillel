package HOME_TASKS.Lesson_7;

public class User {
  private String name;
  private String password;
  private String email;

  public User(String name, String password, String email) {
    this.name = name;
    this.password = password;
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
