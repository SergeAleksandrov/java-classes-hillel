package Infrastructure;

public class Configuration {

  public static void main(String[] args) {
    String envVar = "browserType";
    String browser = System.getenv("browserType") != null ? System.getenv("browserType") : "Chrome";
    System.out.println("Browser is " + browser);
    //System.out.println(System.getenv(args[0]));

  }

}
