package Infrastructure.Utils;

import Infrastructure.Config.ConfigurationManager;

public class TestServer {

  public String getUrl (){
    String server = ConfigurationManager.getInstance().getTestEnv();

    switch (server){
      case "local":
        return "http://192.168.0.15";
      case "staging":
        return "http://staging.website.com:5678";
      case "QA":
        return "http://qa.website.com:5670";
      case "production":
        return "http://website.com";
      default:
        return "Invalid";
    }
  }
}
