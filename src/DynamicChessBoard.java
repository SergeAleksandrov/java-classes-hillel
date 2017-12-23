public class DynamicChessBoard {

  public static void main(String[] args) {
    chessBoard(10,10);
  }

  public static void chessBoard(int height, int width) {
    for (int x = 1; x <= height; x++) {
      if (x%2!=0) {
        for (int n = 1; n <= width; n++){
          if (n%2!=0){
          System.out.print("#");
          }
          else {
            System.out.print(" ");
          }
        }
      }
      else {
        for (int n = 1; n <= width; n++){
          if (n%2!=0) {
            System.out.print(" ");
          }
          else {
            System.out.print("#");
          }
        }
      }
      System.out.println();
      }
    }
  }

