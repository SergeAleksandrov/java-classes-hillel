package HOME_TASKS.Lesson_2;

public class CheckPassFail {

  public static void main(String[] args) {
    markCheckPassFail();
    System.out.println("DONE");

  }
  public static void markCheckPassFail(){
    int mark = 50;
    if (mark >=50){
      System.out.println("PASS");
    }
    else {
      System.out.println("FAIL");
    }
  }
}