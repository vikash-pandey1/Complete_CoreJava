public class str_formate {
    public static void main(String[] args) {
        String s = new String("vikash");
        String s1 = new String("pandey");
        String s2 = String.join("%s%s",s,s1);
        System.out.println(s2.toString());
        System.out.println();
    }
}
