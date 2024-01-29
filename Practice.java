import java.util.*;
public class Practice 
{
    public static void main(String...args)
    {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter your value");
        int a = sc.nextInt();
        System.out.println("enter your second value");
        int b = sc.nextInt();
        int c=b;
        int h=a;
        for(int i =1;i<=a;i++)
        for(int k=1;k<=b;k++)
        {
            h=(h*2)+2;
            System.out.print(h +" ");
            c=(c*2)+2;
            System.out.print(c +" ");
        }
        sc.close();*/
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no ");
        int a = sc.nextInt();
        if(a<=127 && a>=-128)
        {
            System.out.println(a +": it can be fitter in "+"\n"+" byte");
        }
        else
        System.out.println("no is invailid");
        sc.close();
    }
}