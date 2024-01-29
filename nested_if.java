import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your weight ");
        int weight = sc.nextInt();
        if(age>=18)
        {
            if(weight>=60){
                System.out.println("you are eligible to donate the blood");
            }
        }
        else
        System.out.println("you not eligible to donate the blood");
        sc.close();
    }
}
