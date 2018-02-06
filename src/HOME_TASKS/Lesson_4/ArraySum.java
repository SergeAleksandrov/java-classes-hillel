package HOME_TASKS.Lesson_4;

public class ArraySum {

  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,7,8};
    System.out.println("Array's sum is " + sum(array));
  }

  public static int sum (int[] array){
    int sum = 0;
    for (int l : array){
      sum += l;
    }
    return sum;
  }
}
