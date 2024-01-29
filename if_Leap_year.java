import java.util.*;
public class if_Leap_year {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int year = sc.nextInt();
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            System.out.println("leap year");
        }
        else{
        System.out.println("this is not a leap year");
        }sc.close();
    }
}
