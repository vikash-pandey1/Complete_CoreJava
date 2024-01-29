package conversion;

public class char_int {
    public static void main(String[] args) {
        // char c='c';
        // char c1 = 'v';     // used to get ascii value
        // int i=c;
        // int i1 = c1;
        // System.out.println(i);
        // System.out.println(i1);
        char c = 'c';
        int i = Character.getNumericValue(c);
        System.out.println(i);

    }
}
