package Infrastructure;

public class WebDriverManager {

  public String create(){
    String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
    switch (testBrowser){
      case "chrome":
        return "Google Chrome";
      case "firefox":
        return "Mozilla FireFox";
      case "safari":
        return "Apple Safari";
      case "ie":
        return "MS Internet Explorer";
      default:
        return "Invalid";
    }
  }
}
