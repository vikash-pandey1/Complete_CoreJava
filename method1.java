import java.util.Scanner;
public class method1 {
    synchronized public static void evod(int num){
        if(num%2==0){
            System.out.println("this is even no");
        }
        else{
            System.out.println("this is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int num = sc.nextInt();
        evod(num);
    }
}
