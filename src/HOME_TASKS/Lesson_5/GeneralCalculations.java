package HOME_TASKS.Lesson_5;

public class GeneralCalculations {

  public static void main(String[] args) {
    int myAge = 46;
    myLife(myAge);
  }

  public static void myLife(int myAge){
    System.out.println("I'm " + myAge + " years old.");
    System.out.println("My age in seconds is - " + myAge*365*24*60*60);
    System.out.println("My age in minutes is - " + + myAge*365*24*60);
    System.out.println("My age in hours is - " + + myAge*365*24);
    System.out.println("My age in days is - " + + myAge*365);
    System.out.println("My age in weeks is - " + + myAge*52);

  }
}
