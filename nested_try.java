import java.util.Scanner;

public class nested_try {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("enter the no index no that you want to print ");
            int no = sc.nextInt();
            try {
                System.out.println("the index value is that no you enter ");
                try {
                    System.out.println(arr[no]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry the index is not exist");
                    System.out.println("welcome to inner exception level 2");
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println("welcome to outer exception level 1");
                System.out.println(e);
            }
        }

       
    }
}
