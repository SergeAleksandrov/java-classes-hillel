package HOME_TASKS.Lesson_3;

public class Exponent {
  public static void main(String[] args) {
    double a4 = four(2);
    double a6 = six(2);
    System.out.println("a4 = " + a4);
    System.out.println("a6 = " + a6);
  }

  public static double four(double a) {
    double b = a * a;
    return b * b;
  }

  public static double six(double a) {
    double b = a * a;
    return b * b * b;
  }
}
