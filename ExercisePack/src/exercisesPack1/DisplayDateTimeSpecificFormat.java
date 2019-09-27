package exercisesPack1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DisplayDateTimeSpecificFormat {

    public static void showCurrentDateTime() {
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        sdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        System.out.println("\nNow: " + sdt.format(System.currentTimeMillis()));
    }

}
