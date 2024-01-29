public class Array_copy {
    public static void main(String[] args) {
        String a[] = {"vikash","pandey","bk","arya"};
        String b [] = new String[3];
        System.arraycopy(a, 0, b, 0, 3);
        System.out.println(String.valueOf(b));
    }
}
