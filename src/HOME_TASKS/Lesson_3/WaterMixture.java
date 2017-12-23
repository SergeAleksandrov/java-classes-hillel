package HOME_TASKS.Lesson_3;

public class WaterMixture {

  public static void main(String[] args) {
    double volume = volume(2.5, 4.8);
    double temperature = temperature(10, 8);
    System.out.println("Volume of water mixture is " + volume);
    System.out.println("Temperature of water mixture is " + temperature);
  }
  public static double volume(double v1, double v2){
    return v1 + v2;
  }
  public static double temperature(double t1, double t2){
    return t1 + t2;
  }
}
