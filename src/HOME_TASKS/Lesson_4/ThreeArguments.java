package HOME_TASKS.Lesson_4;

import java.util.Scanner;

public class ThreeArguments {

  // This program accepts parameters and calculates the result

  public static void main(String[] args) {

    System.out.println("Please, input '1' to print usage, or");
    System.out.println("              '2' for exponentiation, or");
    System.out.println("              '3' for square root, or");
    System.out.println("              '4' for modulus");

    Scanner in = new Scanner(System.in);
    while (!in.hasNextInt()) {
      System.out.println("It's not a correct input. Try again");
      in.next();
    }
      int operation = in.nextInt();

    if (operation == 1) {                                        // prints usage
      System.out.println("\"Usage:\n" +
              "-pow [number] [power]\n" +
              "-sqrt [number]\n" +
              "-abs [number]\n" +
              "\"");
    } else if (operation == 2) {                                 //  Math.pow
      System.out.println("Please, input the base");
      System.out.println("Please, input the exponent");
      Scanner in2 = new Scanner(System.in);
      while (!in2.hasNextDouble()) {
        System.out.println("It's not a correct input. Try again");
        in2.next();
      }
      double base = in2.nextDouble();
      while (!in2.hasNextDouble()) {
        System.out.println("It's not a correct input. Try again");
        in2.next();
      }
      double exponent = in2.nextDouble();
      System.out.println(Math.pow(base, exponent));
    } else if (operation == 3) {                                 //  Math.sqrt
      System.out.println("Please, input the number");
      Scanner in2 = new Scanner(System.in);
      while (!in2.hasNextDouble()) {
        System.out.println("It's not a correct input. Try again");
        in2.next();
      }
      double number = in2.nextDouble();
      System.out.println(Math.sqrt(number));
    } else if (operation == 4) {                                 // Math.abs
      System.out.println("Please, input the number");
      Scanner in3 = new Scanner(System.in);
      while (!in3.hasNextDouble()) {
        System.out.println("It's not a correct input. Try again");
        in.next();
      }
      double modulus = in3.nextDouble();
      System.out.println(Math.abs(modulus));
      System.out.println("Input outside the interval\n");
    } else {
      System.out.println("It's not a correct input. Try again");
    }
  }
}

