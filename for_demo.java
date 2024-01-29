import java.util.Scanner;
public class for_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = sc.nextInt();
        int j = 1;

        for(int i=1;i<=10;i++)
        {
            j = no*i;
            System.out.println(j);
            
        }
        
        sc.close();
    }
}
