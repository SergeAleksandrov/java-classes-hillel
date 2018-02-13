package HOME_TASKS.Lesson_7;

import Infrastructure.TestLogger;

public class MyNewApp {
  public static void main(String[] args) {
    User user = new User("Masha", "Popova", "ddd@gmail.com");
    User user2 = new User("Paul", "Smith", "fff@gmail.com");
    user2.setName("Bummer!");
    user2.getName();
    System.out.println(user2.getName());
    System.out.println(user.toString());

    TestLogger logger = new TestLogger();
    logger.log("Start browser");
    logger.log("Open website");
    logger.log("Login User");
    logger.log("Open My Account");
  }
}
