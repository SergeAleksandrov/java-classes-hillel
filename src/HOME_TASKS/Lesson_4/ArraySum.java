package HOME_TASKS.Lesson_4;

public class ArraySum {

  public static void main(String[] args) {
    System.out.println("Array's sum is " +sum());
  }

  public static int sum (){
    int[] array = {1,2,3,4,5,7};
    int sum = 0;
    for (int l : array){
      sum = sum + l;
    }
    return sum;
  }
}
