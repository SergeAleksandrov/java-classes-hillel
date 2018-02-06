package HOME_TASKS.Lesson_5;

import java.util.Arrays;

public class StringOperations {
  public static void main(String[] args) {
    int a = 5;
    String w = "M6y777 t789ea9879m i97897s97 9t789he b78979es97897t";
    w=w + "34";
    System.out.println(w);
    w = w.replaceAll("\\d", "");
    System.out.println(w);
    String[] s = w.split("\\d");
    System.out.println(Arrays.toString(s));
  }

}
