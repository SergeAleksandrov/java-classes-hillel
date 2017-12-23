package HOME_TASKS.Lesson_3;

public class CurrencyRate {
  public static void main(String[] args) {
    double usd = usd(222, 2);
    System.out.println(usd);
  }

  public static double usd(double UAH, double cr){
    // Currency rate is a value of 1 USD in UAH
    return UAH/cr;
  }
}
