package CodeWar;

public class CountingDuplicatesInString {
  public static void main(String[] args) {
    String text = "11Ppp22";
    System.out.println("Number of duplicates is " + duplicateCount(text));
  }

  public static int duplicateCount(String text) {
    String[] convert = text.split("");
    int duplicate = 0;
    for (int i = 0; i < convert.length-1; i++) {
      for (int j = i + 1; j < convert.length; j++) {
        if ((convert[i].equals(convert[j])) && (i != j)) {
          System.out.println("Duplicate Element is : " + convert[j]);
          duplicate++;
        }
      }
    }
    return duplicate;
  }
}

