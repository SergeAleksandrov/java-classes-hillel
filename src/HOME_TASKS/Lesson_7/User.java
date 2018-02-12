package HOME_TASKS.Lesson_7;

public class User {
  private String name;
  private String password;
  private String email;

  public User(String name, String password, String email) {
    this.name = name;
    this.password = hashPassword(password);
    this.email = email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  private String hashPassword (String password){
    return password + "_hash";
  }

  @Override
  public String toString() {
    return "User{" + "name='" + name + '\'' + ", password='" + password + '\'' + ", email='" + email + '\'' + '}';
  }
}
