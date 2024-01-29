package conversion;
//           using string.valueof()
// public class int_string {
//     public static void main(String[] args) {
//         int i=100;
//         String s = String.valueOf(i);
//         System.out.println(s+100);
//         System.out.println(i+100);
//     }
// }

//        using Integer.tostring()
// public class int_string {
//     public static void main(String[] args) {
//         int i=100;
//         String s = Integer.toString(i);
//         System.out.println(s+100);
//         System.out.println(i+100);
//     }
// }
    // using  string.format()
    public class int_string {
        public static void main(String[] args) {
            int i=100;
            String s = String.format("%d",i);
            System.out.println(s+100);
            System.out.println(i+100);
        }
    }
