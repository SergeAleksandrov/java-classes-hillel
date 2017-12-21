package HOME_TASKS.Lesson_2;

public class PrintDayInWord_1 {

  public static void main(String[] args) {
    dayPrintDayInWord();
  }

  public static void dayPrintDayInWord(){
    int day = 8;

    if (day == 1){
      System.out.println("Sunday");
    }
    else if (day == 2) {
      System.out.println("Monday");
    }
    else if (day == 3) {
      System.out.println("Tuesday");
    }
    else if (day == 4) {
      System.out.println("Wednesday");
    }
    else if (day == 5) {
      System.out.println("Thursday");
    }
    else if (day == 6) {
      System.out.println("Friday");
    }
    else if (day == 7) {
      System.out.println("Saturday");
    }
    else {
      System.out.println("Not a valid day");
    }
  }
}
