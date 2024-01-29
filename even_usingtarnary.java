import java.util.Scanner;

public class even_usingtarnary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int no = sc.nextInt();
        String tar = (no%2==0)?"the no is ever":"the no is odd";
        System.out.println(tar);
        sc.close();
    }
}
