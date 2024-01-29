package conversion;
import java.text.SimpleDateFormat;
import java.util.Date;
public class str_date {
    public static void main(String[] args)throws Exception {
        String s = "10/9/1939";
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse(s);
        System.out.println(s+"\t"+d);
    }
}