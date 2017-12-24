package HOME_TASKS.Lesson_3;

public class Divider {

  public static void main(String[] args) {
    double result = dividerAB(41, 2);
    if (result == 0) {
      System.out.println("'b' is a divider of 'a'");
    } else {
      System.out.println("'b' is not a divider of 'a'");
    }
  }

  public static double dividerAB(double a, double b) {
    double result = 0;
    return result = a % b;
  }
}
