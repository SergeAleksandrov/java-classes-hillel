package HOME_TASKS.Lesson_9.Base;

import Infrastructure.Logger.TestLogger;
import Infrastructure.Utils.TestServer;
import Infrastructure.WebDriverManager.WebDriverManager;

public class TestBase {

  protected WebDriverManager wdm;
  protected String browser;
  protected TestLogger logger;

  // Before
  public void setUp(){
    logger = new TestLogger();
    wdm = new WebDriverManager();
    browser = wdm.create();
    String url = new TestServer().getUrl();
    logger.log("Open website" + url);
  }
  // After
  public void cleanUp(){
  logger.log("Close browser");
  wdm.destroy("browser");
  }
}
