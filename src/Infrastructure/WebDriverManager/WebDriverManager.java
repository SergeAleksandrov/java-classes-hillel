package Infrastructure.WebDriverManager;

import Infrastructure.Config.ConfigurationManager;

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
  public void destroy (String browser){
    System.out.println(browser + " was closed");
  }
}
