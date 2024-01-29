package conversion;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class date_str {
    public static void main(String[] args) {
        Date d = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String sd = df.format(d);
        System.out.println("converted:"+sd);
    }
}
