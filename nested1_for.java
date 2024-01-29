import java.util.Scanner;

public class nested1_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();
        /*for(int i=1;i<=no;i++)
        {
            for(int j=no-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            System.out.print("*");
            System.out.println("");
        }
        sc.close();*/
        for(int i =no;i>=1;i--){
            for(int j=no-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        sc.close();
    }
}
