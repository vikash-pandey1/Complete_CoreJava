import java.util.Scanner;

//import java.util.*;
public class pattern {
    public static void main(String[] args) {
        int i=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>i)
        { int j=1;
            while(2*n>=j)
            {
             if((i==1 && j==n) || (i>1&&j==n-i)||(i>1 && j==n+i))
{
    System.out.print("* ");
}else
System.out.print(" ");
                j++;
            }
            i++;
            System.out.println();
        }
         i=n-1;
    while(1<=i)
        { int j=1;
            while(2*n>=j)
            {
                //if(i==)
             if((2*i-1==2*n-1 && j==n) || (i>1&&j==n-i)||(i>1 && j==n+i))
{
    System.out.print("*");
}else
System.out.print(" ");
                j++;
            }
            i--;
            System.out.println();
        }
        s.close();
    }

    public static pattern compile(String string) {
        return null;
    }

    public int Matcher(String string) {
        return 0;
    }
}
