package HOME_TASKS.Lesson_4;

import java.util.Scanner;

public class DecimalBinary {

  public static void main(String[] args) {
    BinaryToDecimal();
    DecimalToBinary();
  }

  public static void BinaryToDecimal(){
    int input = 232;
    System.out.println("Binary number is " + Integer.toBinaryString(input));
  }
  public static void DecimalToBinary(){
    String input = "11101000";
    System.out.println("Decimal number is " + Integer.parseInt(input,2));
  }
}

