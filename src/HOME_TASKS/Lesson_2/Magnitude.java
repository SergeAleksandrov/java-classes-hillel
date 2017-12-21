package HOME_TASKS.Lesson_2;

public class Magnitude {
  public static void main(String[] args) {
    twoNumbersMagnitude();
  }

  public static void twoNumbersMagnitude(){
    int a = 4;
    int b = -9;

    if (Math.abs(a)>Math.abs(b)){
      System.out.println("Magnitude of number 'a' more than magnitude of number 'b'");
    }
    else {
      System.out.println("Magnitude of number 'b' more than magnitude of number 'a'");
    }
  }
}
