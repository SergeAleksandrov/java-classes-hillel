package HOME_TASKS.Lesson_8;

import Infrastructure.ConfigurationManager;

public class TestApp {
  public static void main(String[] args) {
    String browser = ConfigurationManager.getInstance().getTestBrowser();
    String env = ConfigurationManager.getInstance().getTestEnv();

    System.out.println(browser);
    System.out.println(env);



  }
}
