package HOME_TASKS.Lesson_4;

public class ArrayOfCodes {

  public static void main(String[] args) {
    char[] charArray = {'j', 'a', 'v', 't'};
    int[] intArray = new int[4];
    for (int i = 0; i < charArray.length; i++) {
      int temp = (int) charArray[i];
      intArray[i] = temp;
    }
    for (int l : intArray){
      System.out.print(l + " ");

    }
  }
}
