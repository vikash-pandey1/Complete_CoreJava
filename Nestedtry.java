public class Nestedtry 
{
    public static void main(String[] args) 
    {
        // try {
        //     try {
        //         System.out.println("going to divide by 0");
        //         int b = 99/0;
        //     } catch (ArithmeticException e) {
        //         System.out.println(e);
        //     }
        //     try {
        //         int arr[] = new int[10];
        //         arr[10] = 90;
        //     } catch (IndexOutOfBoundsException e) {
        //         System.out.println(e);
        //         System.out.println("othere statement");
        //     }
        // } catch (Exception e) {
        //     System.out.println("handler the exception (outer catch)");
        // }
        // System.out.println("normal flow");
        try
        { 
            try 
            {
                try 
                {
                    System.out.println("inner block 2");
                    int arr[] = new int[10];
                    arr [11] = 19;
                } 
                catch (ArithmeticException e) 
                {
                    System.out.println(e);
                }
            } 
            catch (NullPointerException e) 
            {
                System.out.println(e);
            }
        } 
        catch (NullPointerException e)
        {
            System.out.println("null pointer exception");
        }
        catch(Exception e1){
            System.out.println(e1);
        }
    }
}
