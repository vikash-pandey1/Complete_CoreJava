import java.util.Scanner;

public class Switch {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your month that you want to print");
        int  no = sc.nextInt();
        String month = " ";
        switch(no)
        {
            case 1: month="janurary"; break;
            case 2: month="feburary"; break;
            case 3: month="march"; break;
            case 4: month="april"; break;
            case 5: month="may"; break;
            case 6: month="june"; break;
            case 7: month="july"; break;
            case 8: month="august"; break;
            case 9: month="september"; break;
            case 10: month="octobar"; break;
            case 11: month="november"; break;
            case 12: month="december"; break;

        }
        System.out.println(month);
        sc.close();
    }
}
