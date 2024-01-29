package conversion;

public class float_str {
    public static void main(String[] args) {
        float f = 1000.9F;
        String s = String.valueOf(f);
        String s1 = Float.toString(f);
        System.out.println(s+100);
        System.out.println(s1+200);
    }
}
