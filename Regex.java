import java.util.regex.Matcher;

public class Regex {
    private static final String String = null;

    public static void main(String[] args) {
        String s = " 2-3  fdfdf fdff dffddg h d";
        pattern p = pattern.compile("\\-d\\d");
        Matcher m - p.Matcher(String);
        while(m.find()){
           // System.out.println(m.start()+" "+m.end());
            System.out.println(s.substring(m.start(),m.end()));
        }

    }
}
