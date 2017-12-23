package HOME_TASKS.Lesson_3;

public class WaterMixture {
  public static void main(String[] args) {
    volume(2.5, 4.3);
    temperature(10, 7);
    System.out.println("Volume of water mixture is " + volume(2.5, 4.3));
    System.out.println("Temperature of water mixture is " + temperature(10, 7));
  }
  public static double volume(double v1, double v2){
    return v1 + v2;
  }
  public static double temperature(double t1, double t2){
    return t1 + t2;
  }
}
