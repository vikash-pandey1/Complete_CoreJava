import java.util.Scanner;

public class exception_practice {
    public static void main(String[] args) {
        int arr [] = {1,2,34,5,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array index");
        int i = sc.nextInt();
        System.out.println("enter the no you want to devide ");
        int div = sc.nextInt();
        
        try {
            System.out.println(arr[i]);
            System.out.println(arr[i]/div);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
