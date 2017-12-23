public class SquareBoard {

  public static void main(String[] args) {
    letsDoIt(5);
  }

  public static void  letsDoIt(int numberOfLoops) {
    for (int x = 1; x <= 5; x++) {
      for (int n = 1; n <= numberOfLoops; n++) {
        System.out.print("# ");
      }
      System.out.println();
    }
  }
}
