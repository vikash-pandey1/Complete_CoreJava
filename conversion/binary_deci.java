package conversion;

import java.util.Scanner;

public class binary_deci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your binary no");
        String  no = sc.nextLine();
        int decimal = Integer.parseInt(no,2);
        System.out.println(decimal);
        sc.close();
    }
}
