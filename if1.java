import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income ");
        int a = sc.nextInt();
        if(a<250000)
        {
            System.out.println("you are not eligible for tax");
        }
        else if(a>+250000&&a<500000){
            System.out.println("your tax amount is :"+(a*5)/100);
        }
        else if(a>=500000&&a<1000000){
            System.out.println("your tax amount is :"+(a*20)/100);
        }
        else if(a>=1000000)
        {
            System.out.println("your tax amount is :"+(a*30)/100);
        }
        /*System.out.println("enter the marks of b ");
        int b = sc.nextInt();
        System.out.println("enter the marks of c");
        int c = sc.nextInt();
        float avg =(a+b+c)/3.0f;

        if(avg>=40&&a>=33&&b>=33&&c>=33)
        {
            System.out.println("you are pass");
        }
        else
        System.out.println("congrats you are fail");*/
        sc.close();
    }
}
