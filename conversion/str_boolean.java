package conversion;

public class str_boolean {
    public static void main(String[] args) {
        String s = "true";
        String s1 = "false";
        boolean b = Boolean.parseBoolean(s);
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(b);
        System.out.println(b1);

    }
}
