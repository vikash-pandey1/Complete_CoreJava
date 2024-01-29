import java.util.StringTokenizer;

public class compare_string {
    public static void main(String[] args) {
        StringTokenizer s = new StringTokenizer("vikash pandey  vinay pal bk arya ");
        while (s.hasMoreElements()) {
            System.out.println(s.nextElement());
        }
    }
}
