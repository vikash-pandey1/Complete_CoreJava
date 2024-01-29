package conversion;

public class boolean_str {
    public static void main(String[] args) {
        boolean b = true;
        boolean b1 = false;
        String s = String.valueOf(b);
        String s1 = String.valueOf(b1);
        String s2 = Boolean.toString(b);
        String  s3 = Boolean.toString(b1);
        System.out.println(s+" vi");
        System.out.println(s1+" vi");
        System.out.println(s2+" vi");
        System.out.println(s3+" vi");
    }
}
