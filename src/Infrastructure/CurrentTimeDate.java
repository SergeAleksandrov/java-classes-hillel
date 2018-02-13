package Infrastructure;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeDate {
  public static void main(String[] args) {
    String time = "HH:mm:ss:SSS";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    String date = simpleDateFormat.format(new Date());
    System.out.println(date);
  }
}

