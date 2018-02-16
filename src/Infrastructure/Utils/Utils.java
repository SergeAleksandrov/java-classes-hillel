package Infrastructure.Utils;

public class Utils {

  public static int randomFromRange(int min, int max) {
    return min + (int) (Math.random() * (max - min) + 1);
  }
}
