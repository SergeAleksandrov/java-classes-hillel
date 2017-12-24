package HOME_TASKS.Lesson_3;

import java.util.Scanner;

public class Interval {

  public static void main(String[] args) {

    System.out.println("Input any number, please...");
    Scanner in = new Scanner(System.in);
    int input = in.nextInt();
    if (input >= -5 && input <= 3) {
      System.out.println("Input inside the interval\n");
    } else {
      System.out.println("Input outside the interval\n");
    }
    System.out.println("Thank you. See you later");
  }
}
