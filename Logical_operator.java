public class Logical_operator {
    public static void main(String...v){
        int a = 10;
        int b = 20;
        int c = 8;
        System.out.println(a>b&&b>c);//false&&true = false   logical and
        System.out.println(a>b&b<c);//false&true = false     bitwise and 
        System.out.println(a>b&&a++>c);// false&&false = false
        System.out.println(a);
        System.out.println(a<c&a++>c);// false&true = false 
        System.out.println(a);
        System.out.println(a<b||a<c); // true||false = true logical or
        System.out.println(a<b|b<c); // true |false = true bitwise or
        System.out.println(a<b||a++<c); // true||false = true logical or
        System.out.println(a);
        System.out.println(a<b|b--<c); // true |false = true bitwise or
        System.out.println(b);

    }
}
