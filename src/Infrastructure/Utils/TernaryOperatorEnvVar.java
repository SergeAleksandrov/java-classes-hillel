package Infrastructure.Utils;

public class TernaryOperatorEnvVar {

  public static void main(String[] args) {
    // Choosing of browser with a help of ternary operator
    String envVar = "browserType";
    String browser = System.getenv("browserType") != null ? System.getenv("browserType") : "Chrome";
    System.out.println("Browser is " + browser);
    //System.out.println(System.getenv(args[0]));

  }

}
