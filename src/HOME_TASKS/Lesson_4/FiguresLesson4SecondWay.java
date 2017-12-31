package HOME_TASKS.Lesson_4;

public class FiguresLesson4SecondWay {

  public static void main(String[] args) {

    figureOne();
    figureTwo();
    figureThree();
    figureFour();
    figureFive();
    figureSix();
    figureSeven();
    figureEight();
    figureNine();
  }

  public static void figureOne() {

    System.out.println("\n \n");
    System.out.println("Figure №1 (второй вариант) \n");

    int n = 8, m;

    for (int i = 0; i < n; i++) {
      m = n - i;
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
      m = n - (n - i);
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

  public static void figureFive() {

    System.out.println("\n \n");
    System.out.println("Figure №5 (второй вариант) \n");

    int n = 8, m, l;

    for (int i = 0; i < n; i++) {
      l = n - i;
      m = n - (n - i);
      for (int y = 0; y < l; y++) {
        for (int x = 0; x < m; x++) {
          System.out.print("  ");
        }
        System.out.print("# ");
        m = 0;
      }
      System.out.println();
    }
  }

  public static void figureSix() {

    System.out.println("\n \n");
    System.out.println("Figure №6 (второй вариант) \n");

    int n = 8, m, l;

    for (int i = 0; i < n; i++) {
      l = n - i;
      m = n - (n - i);
      for (int y = 0; y <= m; y++) {
        for (int x = 1; x < l; x++) {
          System.out.print("  ");
        }
        System.out.print("# ");
        l = 0;
      }
      System.out.println();
    }
  }

  public static void figureSeven() {

    System.out.println("\n \n");
    System.out.println("Figure №7 (второй вариант) \n");

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
          if (y == 1 || y == 5) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else if (i == 4 || i == 8) {
        for (int y = 0; y < 7; y++) {
          if (y == 2 || y == 4) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else {
        for (int y = 0; y < 7; y++) {
          if (y == 3) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      }
    }
  }

  public static void figureEight() {

    System.out.println("\n \n");
    System.out.println("Figure №8 (второй вариант) \n");

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
      } else if (i == 2) {
        for (int y = 0; y < 7; y++) {
          if (y == 1) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else if (i == 4) {
        for (int y = 0; y < 7; y++) {
          if (y == 2) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else if (i == 6) {
        for (int y = 0; y < 7; y++) {
          if (y == 3) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else if (i == 8) {
        for (int y = 0; y < 7; y++) {
          if (y == 4) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else {
        for (int y = 0; y < 7; y++) {
          if (y == 5) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      }
    }
  }
  public static void figureNine() {

    System.out.println("\n \n");
    System.out.println("Figure №9 (второй вариант) \n");

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
      } else if (i == 2) {
        for (int y = 0; y < 7; y++) {
          if (y == 5) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else if (i == 4) {
        for (int y = 0; y < 7; y++) {
          if (y == 4) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else if (i == 6) {
        for (int y = 0; y < 7; y++) {
          if (y == 3) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else if (i == 8) {
        for (int y = 0; y < 7; y++) {
          if (y == 2) {
            System.out.print("#   ");
          } else {
            System.out.print("    ");
          }
        }
        System.out.println();
      } else {
        for (int y = 0; y < 7; y++) {
          if (y == 1) {
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
