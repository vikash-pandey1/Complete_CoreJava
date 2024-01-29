package conversion;

public class double_str {
    public static void main(String[] args) {
        double d = 100.4D;
        String s = String.valueOf(d);
        String s1 = Double.toString(d);
        System.out.println(s+100);
        System.out.println(s1+100);
    }
}
