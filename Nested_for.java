public class Nested_for {
    public static void main(String[] args) {
       /*  for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)        // nested for example
            {
                System.out.println(i+" " +j);
            }
        }*/
        int a =5;
        for(int i=1;i<=a;i++){
            for(int j=a-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
