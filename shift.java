public class shift {
    public static void main(String...v)
     {
      int a = 10;
        System.out.println(2<<2);//2*2^2=8
        System.out.println(5<<3);//5*2^3=40
        System.out.println(5<<6);//5*2^6=5*64=320
        System.out.println(10>>2);//10/2^2=2
        System.out.println(6>>4);//6/2^4=0
        System.out.println(9>>3);//9/2^3=1
        //difference between >> and >>>
          //for positive no work is same 
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(10>>>2);//10/2^2=10/4=2
        System.out.println(-10>>2);//-10/2^2=-10/4=-2
        System.out.println(-10>>>2);//
        System.out.println(a<<2);
    }
}
