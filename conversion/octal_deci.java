package conversion;

import java.util.Scanner;

public class octal_deci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your octal no");
        String no = sc.nextLine();
        int i1 = Integer.parseInt(no,8);
        System.out.println(i1);
        sc.close();
    }
}