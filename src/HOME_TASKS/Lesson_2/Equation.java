package HOME_TASKS.Lesson_2;

public class Equation {

  public static void main(String[] args) {
    simpleEquation();
  }

  public static void simpleEquation() {
    int a = 1;
    int b = 2;
    int x = 0;

    if (a == 0 || b == 0) {
      System.out.println("If a=0, it's incorrect mathematical action - impossible to divide on '0'\n" +
                         "If b=0, it's also impossible because 'b' should be only negative in this equation");
    } else {
      x=-b/a;
      System.out.println(x);
    }
  }
}