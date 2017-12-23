public class Loops {

  public static void main(String[] args) {
    //simpleWhileLoop(6);
    simpleForLoop();
    //simpleWhileLoop(-2);
    //simpleDoWhileLoop(-2);
  }

  public static void simpleWhileLoop(int numberOfIterations){
    System.out.println("'While' loop starts");
    int i = 0;
    while (i < numberOfIterations){
      System.out.println(i);
      i++;
    }
  }
  public static void simpleForLoop(){
    System.out.println("'For' loop starts");
    int [] numbers = {10, 20, 30, 40, 50};
    for (int x : numbers){
      if (x == 30){
        break;
      }
      System.out.println(x);
      System.out.println("\n");
    }
  }
  public static void simpleDoWhileLoop(int numberOfIterations){
    System.out.println("'Do While' loop starts");
    int i = 0;
    do {
      System.out.println(i);
      i++;
    } while (i<numberOfIterations);
  }
}
