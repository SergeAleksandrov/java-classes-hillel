package HOME_TASKS.Lesson_4;

public class FiguresLesson4SecondWay {

  public static void main(String[] args) {

    figureOne();
    figureTwo();
    figureThree();
    figureFour();
  }

  public static void figureOne() {

    System.out.println("\n \n");
    System.out.println("Figure №1 (второй вариант) \n");

    int n = 8, m;

    for (int i = 0; i < n; i++) {
      m=n-i;
      for (int y = 0; y < m; y++) {
        System.out.print("# ");
      }
      System.out.println();
    }
  }

  public static void figureTwo() {

    System.out.println("\n \n");
    System.out.println("Figure №2 (второй вариант) \n");

    int n = 9, m;

    for (int i = 0; i < n; i++) {
      m=n-(n-i);
      for (int y = 0; y < m; y++) {
        System.out.print("# ");
      }
      System.out.println();
    }
  }

  public static void figureThree() {

    System.out.println("\n \n");
    System.out.println("Figure №3 (второй вариант) \n");

    for (int i = 0; i < 13; i++) {
      if (i == 0 || i == 12) {
        for (int y = 0; y < 7; y++) {
          System.out.print("#   ");
        }
        System.out.println();
      } else if (i % 2 != 0) {
        for (int y = 0; y < 7; y++) {
          System.out.print("    ");
        }
        System.out.println();
      } else {
        for (int y = 0; y < 7; y++) {
          if (y == 0 || y == 6) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      }
    }
  }
  public static void figureFour() {

    System.out.println("\n \n");
    System.out.println("Figure №4 (второй вариант) \n");

    for (int i = 0; i < 13; i++) {
      if (i == 0 || i == 12) {
        for (int y = 0; y < 7; y++) {
          System.out.print("#   ");
        }
        System.out.println();
      } else if (i % 2 != 0) {
        for (int y = 0; y < 7; y++) {
          System.out.print("    ");
        }
        System.out.println();
      } else if (i == 2 || i == 10) {
        for (int y = 0; y < 7; y++) {
          if (y == 0 || y == 1 || y == 5 || y == 6) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else if (i == 4 || i == 8) {
        for (int y = 0; y < 7; y++) {
          if (y == 0 || y == 2 || y == 4 || y == 6) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else {
        for (int y = 0; y < 7; y++) {
          if (y == 0 || y == 3 || y == 6) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      }
    }
  }
}
