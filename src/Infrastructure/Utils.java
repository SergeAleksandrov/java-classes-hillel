package Infrastructure;

public class Utils {

  public static void main(String[] args) {

    int min = 15;
    int max = 47;

    int rand = min + (int) (Math.random() * (max - min) + 1);

    System.out.println(rand);
  }
}
