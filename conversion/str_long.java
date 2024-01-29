package conversion;

public class str_long {
    public static void main(String[] args) {
        String s = "200";
        Long l = Long.parseLong(s);
        System.out.println(l+100);
        System.out.println(s+100);
    }
}
