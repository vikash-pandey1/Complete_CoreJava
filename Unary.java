public class Unary {
    public static void main(String[]x){
        int a = 10;
        System.out.println(a++);//10 (11)
        System.out.println(a++ + ++a); //11+13(13)
        System.out.println(++a + a++);// 14+14(15)
        System.out.println(a++ + ++a);//15+17(17)
        System.out.println(a--);//17(16)
        System.out.println(--a + a--);//15+15(14)
        System.out.println(a);
    }
}
 class test{
    public static void main(String[] args) {
        int a = 10;
        int b = -18;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);
        System.out.println(a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);

    }
}
