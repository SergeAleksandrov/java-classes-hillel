package HOME_TASKS.Lesson_3;

public class VariablesExchange {

  public static void main(String[] args) {
    double a = variableExchange1(5, 100);
    double b = variableExchange2(27, 16);
    System.out.println("Exchange between two variables without using third one - " + "a = " + a);
    System.out.println("Exchange between two variables using third one - " + "a = " + b);
  }

  public static double variableExchange1(double a, double b) {
    return a = a + b - (b = a);
  }

  public static double variableExchange2(double a, double b) {
    double c = a + b;
    return a = c - a;
  }
}