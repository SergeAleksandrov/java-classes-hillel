package CodeWar;

import java.util.Arrays;

public class TwoToOne {

  public static void main(String[] args) {
    String s1 = "aabbccdd";
    String s2 = "kkllmmnn";
    System.out.println(longest(s1, s2));
  }

  public static String longest (String s1, String s2) {
    String s3 = s1 + s2;
    char[] temp = s3.toCharArray();
    String result = "";
    for (int i=0; i <temp.length - 1; i++){
      if (temp[i] != temp[i+1] ){
        result += temp[i];
      }
    }
    result += temp[temp.length - 1];
    return result;
  }
}






