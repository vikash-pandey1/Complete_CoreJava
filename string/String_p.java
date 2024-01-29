public class String_p {
    public static void main(String[] args) {
        String s = "vikash";
        String v = "pandey";
        //System.out.println(s.charAt(5));
       // System.out.println(s.length());
       //System.out.println(s.substring(3));
       System.out.println(s.substring(0, 3));
       //System.out.println(s.concat(v));
       //System.out.println(s.contains("pa"));
       //System.out.println(v.equals(v));
       //System.out.println(e.isEmpty());
       //System.out.println(s.replace('v', 'j'));
       System.out.println(v.replaceAll(s, v));
       System.out.println(s.concat(v));
       String a =s.concat(v);
       System.out.println(a.length());
    }
}
