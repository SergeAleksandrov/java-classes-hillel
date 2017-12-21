package HOME_TASKS.Lesson_2;

public class CheckOddEven {

  public static void main(String[] args) {
    numberCheckOddEven();
    System.out.println("BYE");
  }

  public static void numberCheckOddEven(){
    int number = 4;
    if (number%2==0){
      System.out.println("Even Number");
    }
    else {
      System.out.println("Odd Number");
    }
  }
}
