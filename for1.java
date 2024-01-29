import java.util.Scanner;

public class for1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no  that you want to print piramid length");
        int no = sc.nextInt();
        /*for(int i=1 ;i<=no;i++)
        {
            for(int k=4;k>=i;k--)
            System.out.print(" ");
            for(int j=1;j<=i;j++) 
            System.out.print("*");
            System.out.println("");
        }
        sc.close();*/
        for(int i=no;i<=no;i--)
        {
            for(int j=5;j<=i;j--)
            System.out.print("*");
            System.out.println("");
        }
        sc.close();
    }
}
