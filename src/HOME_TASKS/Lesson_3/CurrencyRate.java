package HOME_TASKS.Lesson_3;

public class CurrencyRate {

  public static void main(String[] args) {
    double usd = usd(100, 29);
    double gbp = gbp(100, 53);
    double eur = eur(100, 34);
    double rub = rub(100, 0.48);
    System.out.println("You have " + usd + " USD");
    System.out.println("You have " + gbp + " GBP");
    System.out.println("You have " + eur + " EUR");
    System.out.println("You have " + rub + " UAH");
  }

  public static double usd(double UAH, double cr){
    // Currency rate (cr) is a value of 1 USD in UAH
    return Math.rint(100.0 * UAH/cr) / 100.0;
  }
  public static double gbp(double UAH, double cr){
    // Currency rate (cr) is a value of 1 GBP in UAH
    return Math.rint(100.0 * UAH/cr) / 100.0;
  }
  public static double eur(double UAH, double cr){
    // Currency rate (cr) is a value of 1 EUR in UAH
    return Math.rint(100.0 * UAH/cr) / 100.0;
  }
  public static double rub(double UAH, double cr){
    // Currency rate (cr) is a value of 1 RUB in UAH
    return Math.rint(100.0 * UAH/cr) / 100.0;
  }
}
