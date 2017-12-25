package HOME_TASKS.Lesson_4;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MinimalNumber {

  public static void main(String[] args) {
    minimalNumberOfArray();
  }

  public static void minimalNumberOfArray(){
    int [] array = new int [10];
    for (int i=0; i<array.length; i++){
      array[i]=i;
    }
      int minValue = 0;
      if (minValue>array[1]){
        minValue=i;
      } else{
        System.out.println("Minimum number of the array is " + minValue);
      }
    }
    System.out.println();
  }
}
