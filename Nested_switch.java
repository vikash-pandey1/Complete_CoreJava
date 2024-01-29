import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int y = sc.nextInt();
        System.out.println("Enter your branch");
        String b = sc.next();
        switch(y)
        {
            case 1:
            {
                System.out.println("physica, chemistery,mathematics,english,engineering drawing");
                break;
            }
            case 2:
              switch(b)
              {
                case "cs":
                {
                    System.out.println("oops,operating system,computer organization,se,engineeting mathematics");
                    break;
                }
                case "me":
                {
                    System.out.println("workshop,ed,plalbing, etc");
                    break;
                }
                case "ece":
                {
                    System.out.println("led,lcd,microprocesor,etc");
                    break;
                }
              }
              break;
            case 3:
              switch(b)
              {
                case "cs":
                {
                    System.out.println("ml,al,data science,network,etc");
                    break;
                }
                case "me":
                {
                    System.out.println("lathing , welding , workshop ,etc");
                    break;
                }
                case "ece":
                {
                    System.out.println("working of led,motherboard,etc");
                    break;
                }
              }
              break;
            case 4:
              switch(b)
              {
                case "cs":
                {
                    System.out.println("cryptography,cloud ,.net,iot,wireless network ,etc");
                    break;
                }
                case "me":
                {
                    System.out.println("i dont know about me 4 year subject");
                    break;
                }
                case "ece":
                {
                    System.out.println("i also dont know about ece 4th year sub");
                    break;
                }
              }
              break;
        }
        sc.close();
    }
}
