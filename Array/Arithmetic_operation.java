import java.util.Scanner;

public class Arithmetic_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation that you want to print ");
        int op = sc.nextInt();
        int a = 19;
        int b =6;
        switch(op)
        {
            case 1:
            System.out.println(a=b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            case 5:
            System.out.println(a%b);
            break;
            default:
            System.out.println("please enter valid input");
        }
        sc.close();
    }
}
