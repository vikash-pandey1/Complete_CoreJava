import java.util.*;
public class Decision_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no");
        int first = sc.nextInt();
        System.out.println("Enter your second no");
        int second = sc.nextInt();
        if(first+second <100)
        {
            System.out.println("The total of both no is under 100");
        }
        else 
        System.out.println("The total of both no is greater than 100");
        sc.close();
    }
}
