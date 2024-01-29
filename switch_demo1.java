import java.util.Scanner;
public class switch_demo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your alphabet");
        char c = sc.next().charAt(0);
        switch(c)
        {
            case 'a':
            System.out.println("this is vowel"); break;
            case 'e':
            System.out.println("this is vowel"); break;
            case 'i':
            System.out.println("this is vowel"); break;
            case 'o':
            System.out.println("this is vowel"); break;
            case 'u':
            System.out.println("this is vowel"); break;
            case 'A':
            System.out.println("this is vowel"); break;
            case 'I':
            System.out.println("this is vowel"); break;
            case 'O':
            System.out.println("this is vowel"); break;
            case 'E':
            System.out.println("this is vowel"); break;
            case 'U':
            System.out.println("this is vowel"); break;
            default:
            System.out.println("this is consonant");
        }
        sc.close();
    }
}
