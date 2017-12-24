package HOME_TASKS.Lesson_3;

public class TheBiggestNumber {

  public static void main(String[] args) {
    int a = 1;
    int b = -2;
    int c = -75;

    if (a == b) {
      System.out.println("'a' = 'b'");
    }
    if (a == c) {
      System.out.println("'a' = 'c'");
    }
    if (c == b) {
      System.out.println("'c' = 'b'");
    }
    if (a > b) {
      if (a > c) {
        System.out.println("The number 'a' is the biggest out of three given numbers");
      } else if (a < c) {
        System.out.println("The number 'c' is the biggest out of three given numbers");
      }
    } else if (a < b) {
      if (b > c) {
        System.out.println("The number 'b' is the biggest out of three given numbers");
      } else {
        System.out.println("The number 'c' is the biggest out of three given numbers");
      }
    }
  }
}
