package HOME_TASKS.Lesson_2;

public class RestFormulas {

  public static void main(String[] args) {
    System.out.println("Answers for the exercises:");
    System.out.println("№9 " + "-   " + nine());
    System.out.println("№10 " + "-   " + ten());
    System.out.println("№11 " + "-   " + eleven());
    System.out.println("№12 " + "-   " + twelve());
    System.out.println("№13 " + "-   " + thirteen());
    System.out.println("№14 " + "-   " + fourteen());
    System.out.println("№15 " + "-   " + fifteen());
    System.out.println("№16 " + "-   " + sixteen());
    System.out.println("№17 " + "-   " + seventeen());
    System.out.println("№18 " + "-   " + eighteen());
  }

  // Exercise № 9
  public static double nine() {
    double x = 10;
    double y = 0;
    return y = Math.pow(1.1, -x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x))) - 3 / 8;
  }

  // Exercise № 10
  public static double ten() {
    double x = -90;
    double y = 0;
    return y = 1 / 3 * Math.sqrt(Math.abs(Math.sin(x))) * Math.cbrt(Math.pow(1, 0.12 * x));
  }

  // Exercise № 11
  public static double eleven() {
    double x = 11;
    double y = 0;
    return y = 2 * Math.PI * x - Math.abs(Math.sin(Math.sqrt(10.5 * x))) * 1 / (Math.cbrt(x * x) + 1 / 7);
  }
  // Exercise № 12
  public static double twelve() {
    double x = 6;
    double y = 0;
    return y = Math.log(Math.sqrt(Math.abs(2 - x)) + 1.2) * 1 / (2 + Math.pow(1, -x)) + Math.cbrt(2 / x);
  }
  // Exercise № 13
  public static double thirteen() {
    double x = 27;
    double y = 0;
    return y = Math.pow((Math.pow(1,(-2+x))),1/5) * 1/Math.sqrt(Math.pow(x, 2)+Math.pow(x, 4)+Math.log(Math.abs(x-3.14)));
  }
  // Exercise № 14
  public static double fourteen(){
    double x = -44;
    double y = 0;
    return y = (Math.sqrt(Math.sin(3*x/2)) + Math.pow(Math.pow(1, 1.3*x)+Math.pow(1, -1.3*x),1/3)) * 1/Math.abs(x+5/2);
  }
  // Exercise № 15
  public static double fifteen(){
    double x = 88;
    double y = 0;
    return y = (Math.abs(x*Math.log(x)-4)*Math.sqrt(x)) * 1/Math.pow(Math.pow(1, 4*x-1),1/5);
}
  // Exercise № 16
  public static double sixteen(){
    double x = 51;
    double y = 0;
    return y = Math.cbrt(Math.pow(1, 2*x)*Math.sqrt(x)-(x+1/3)/x) * Math.abs(Math.cos(2.5*x));
  }
  // Exercise № 17
  public static double seventeen(){
    double x = 19;
    double y = 0;
    return y = Math.pow(x, 3)/3 - Math.pow(1, x)*Math.log(Math.abs(Math.pow(1.3, 3)+Math.pow(x, 3))) + 4/3;
  }
  // Exercise № 18
  public static double eighteen(){
    double x = 33;
    double y = 0;
    return y = Math.abs(7.2-10*x)/Math.cbrt(Math.pow(x, 2)+Math.pow(1, x)) * Math.atan(4*(x/3)/Math.sqrt(Math.pow(1.1, 3))+Math.pow(x, 2));
  }
}




