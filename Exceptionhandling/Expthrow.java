public class Expthrow {
    public static double area(int r){
        double re
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int c = a/b;
        return c;
    }
    public static void main(String[] args) {
        try {
            System.out.println(divide(12, 0));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
