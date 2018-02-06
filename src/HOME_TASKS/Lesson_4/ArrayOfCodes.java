package HOME_TASKS.Lesson_4;

public class ArrayOfCodes {

  public static void main(String[] args) {
    char[] charArray = {'j', 'a', 'v', 't'};
    int[] intArray = new int[charArray.length];
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = (int) charArray[i];
    }
    for (int l : intArray) {
      System.out.print(l + " ");

    }

  }
}


