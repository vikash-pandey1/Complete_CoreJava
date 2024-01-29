public class finally_test{
    public static void main(String[] args) {
        // try {
        //     System.out.println(100/2);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }       // when an exception does not occur
        // finally{
        //     System.out.println("finally block is execute");
        // }
        // System.out.println("rest of the code is executed");
        // try {
        //     System.out.println(100/0);
        // } catch (NullPointerException e) {     // when an exception occur but not handel
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println("finally block is execute always");
        // }
        // System.out.println("rest of the code");
        try {
            System.out.println("inside the try block");
            System.out.println(100/0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is executed always");
        }
        System.out.println("rest fo the code is executed");
    }
}
