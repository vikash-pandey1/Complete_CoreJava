package conversion;

public class char_str {
    public static void main(String[] args) {
        char c ='A';
        String s = String.valueOf(c);
        String s1 = Character.toString(c);
        System.out.println(s);
        System.out.println(s1);
    }
}
