package conversion;

// public class string_int {
//     public static void main(String[] args) {
//         String s = "200";
//         int i=Integer.parseInt(s);
//         System.out.println(s+100);
//         System.out.println(i+100);
//     }
// }

   // using integer.valueof
public class string_int {
    public static void main(String[] args) {
        String s = "200";
        Integer i=Integer.valueOf(s);
        System.out.println(s+100);
        System.out.println(i+100);
    }
}