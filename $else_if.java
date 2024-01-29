import java.util.Scanner;

public class $else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int no = sc.nextInt();
        if(no<=100&&no>=90)
        {
            System.out.println("you got a grade");
        }
        else if(no<90&&no>=75) System.out.println("you got b grade");
        else if(no<75&&no>60) System.out.println("you got c grade");
        else if(no<60&&no>35) System.out.println("you got only passing marks ");
        else if(no<35) System.out.println("congrats you are failed");
        else
        System.out.println("please enter the marks out of 100 ");
        sc.close();
    }
}
