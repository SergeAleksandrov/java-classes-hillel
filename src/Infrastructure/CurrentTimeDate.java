package Infrastructure;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimeDate {
  public static void main(String[] args) {
    String time = "HH:mm:ss:SSS";
    String date = "yyy-MM-dd";

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(time);
    String currentTime = simpleDateFormat.format(new Date());
    System.out.println(currentTime);

    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(date);
    String currentDate = simpleDateFormat2.format(new Date());
    System.out.println(currentDate);
  }
}

