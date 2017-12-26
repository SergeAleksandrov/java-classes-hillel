package HOME_TASKS.Lesson_4;

public class MinimalMaximumNumber {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("List of array numbers: ");

    int[] snake = new int[10];
    for (int i = 0; i < 10; i++) {
      snake[i] = i;
      System.out.print(snake[i] + " ");
    }

    System.out.println("\n");

    int minValue = snake[0];
    int maxValue = snake[0];

    for (int i = 0; i < snake.length; i++) {
      if (snake[i] <= minValue) {
        minValue = snake[i];
      } else if (snake[i] > maxValue){
        maxValue = snake[i];
      }
    }
    System.out.println("Min value is " + minValue);
    System.out.println("Max value is " + maxValue);
  }
}

