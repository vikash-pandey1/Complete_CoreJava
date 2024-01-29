package conversion;

public class long_str {
    public static void main(String[] args) {
        Long l = 1000L;
        String s = String.valueOf(l);
        String s1 = Long.toString(l);
        System.out.println(s+100);
        System.out.println(l+100);
        System.out.println(s1+100);
    
    }
}
