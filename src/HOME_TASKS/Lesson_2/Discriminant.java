package HOME_TASKS.Lesson_2;

public class Discriminant {

  public static void main(String[] args) {
    formulaDiscriminant();
  }

  public static void formulaDiscriminant(){
    double a = 1;
    double b = -8;
    double c = 12;
    int n = 0;

    double d = b*b-4*a*c;

    if (a == 0){
      n=0;
      System.out.println("In quadratic equation 'a' can't be '0'");
    }
    else if (d < 0){
      n=0;
      System.out.println("The quadratic equation has " + n + " roots\n" +
                         "Discriminant is " + d);
    }
    else if (d == 0){
      n=1;
      System.out.println("The quadratic equation has " + n + " root\n" +
                         "Discriminant is " + d);
    }
    else {
      n=2;
      System.out.println("The quadratic equation has " + n + " roots\n" +
                         "Discriminant is " + d);
    }
  }

}
