package HOME_TASKS.Lesson_2;

public class PrintDayInWord_2 {

  public static void main(String[] args) {
    dayPrintDayInWord();
  }

  public static void dayPrintDayInWord(){

    int day = 8;

    switch (day){
      case 1: System.out.println("Sunday");
      break;
      case 2: System.out.println("Monday");
      break;
      case 3: System.out.println("Tuesday");
      break;
      case 4: System.out.println("Wednesday");
      break;
      case 5: System.out.println("Thursday");
      break;
      case 6: System.out.println("Friday");
      break;
      case 7: System.out.println("Saturday");
      break;
      default: System.out.println("Not a valid day");
    }
  }
}
