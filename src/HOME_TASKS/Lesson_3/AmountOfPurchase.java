package HOME_TASKS.Lesson_3;

public class AmountOfPurchase {

  public static void main(String[] args) {
    double total = discountForPurchase(700, 15);
    System.out.println("Total amount to pay is " + total);
  }

  public static double discountForPurchase(double a, int d) {
    double total;
    if (a > 1000) {
      System.out.println("Discount is provided");
      return total = a - (a / 100 * d);
    } else {
      System.out.println("Discount's not provided");
      return total = a;
    }
  }
}
