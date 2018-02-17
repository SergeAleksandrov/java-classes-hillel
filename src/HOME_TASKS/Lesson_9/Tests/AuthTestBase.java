package HOME_TASKS.Lesson_9.Tests;

import Infrastructure.Base.TestBase;

public class AuthTestBase extends TestBase {

  @Override
  public void beforeTest() {
    logger.log("Open login page");
  }

  @Override
  protected void afterTest() {
    logger.log("Some steps");
  }
}
