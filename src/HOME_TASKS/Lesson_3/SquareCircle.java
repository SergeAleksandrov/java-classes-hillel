package HOME_TASKS.Lesson_3;

public class SquareCircle {

  public static void main(String[] args) {
    double a = 10; // Diagonal of the square
    double d = diameterOfCircle(60);
    if (d < a) {
      System.out.println("Circle is inside of the square");
    } else {
      System.out.println("Square is inside of the circle");
    }
    System.out.println("Diameter of the circle is " + d);
    System.out.println("Diagonal of the square is " + a);
  }

  public static double diameterOfCircle(double s) {
    // Diameter of the circle
    double d = 0;
    return d = 2 * Math.sqrt(s / Math.PI); // Taking in account the square of the circle - S=Пr2
  }
}


