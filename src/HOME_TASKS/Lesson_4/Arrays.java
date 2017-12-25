package HOME_TASKS.Lesson_4;

public class Arrays {

  public static void main(String[] args) {
    int [] a = new int[10];
    for (int i=0; i<10; i++){
      a[i]=i; // fills array wit numbers from 0 to 10
    }
    // 1 способ. Вывод элементов массива
    for (int i : a) {     // где а - название массива
      System.out.println(i);
    }
    // 2 способ. Вывод элементов массива
    for (int i=0; i<a.length; i++){ // где а - название массива
      System.out.println(a[i]);
    }
  }
}
