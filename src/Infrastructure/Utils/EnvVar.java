package Infrastructure.Utils;

import Infrastructure.Logger.TestLogger;

public class EnvVar {

  public static void main(String[] args) {
    String browser = getEnvironmentVariableOrDefault("browserType", "Chrome");
    System.out.println(browser);
    TestLogger t = new TestLogger();
    t.log("Start browser");

  }

  public static String getEnvironmentVariableOrDefault(String envVar, String defaultValue){

    return System.getenv(envVar)!=null ? System.getenv(envVar) : defaultValue;
  }
}
