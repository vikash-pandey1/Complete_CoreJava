package conversion;

import java.util.Scanner;

public class hexa_deci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your hexadecimal no");
        String s = sc.nextLine();
        int i = Integer.parseInt(s, 16);
        System.out.println(i);
        sc.close();
    }
}
