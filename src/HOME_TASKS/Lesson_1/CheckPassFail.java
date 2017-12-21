package HOME_TASKS.Lesson_1;

public class CheckPassFail {

  public static void main(String[] args) {
    System.out.println("DONE");
    markCheckPassFail();
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