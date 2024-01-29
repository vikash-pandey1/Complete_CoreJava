import java.util.Scanner;
public class Switch_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no");
        int f = sc.nextInt();
        System.out.println("Enter your second no");
        int s = sc.nextInt();
        System.out.println("Enter the case no that you want to print ");
        int no = sc.nextInt();
        switch(no)
        {
            case 1:
            System.out.println(f+s);
            break;
            case 2:
            System.out.println(f-s);
            break;
            case 3:
            System.out.println(f*s);
            break;
            case 4:
            System.out.println(f/s);
            break;
            case 5:
            System.out.println(f%s);
            break;
            default:
            System.out.println("Enter invailid no");
        }
        sc.close();
    }
}
