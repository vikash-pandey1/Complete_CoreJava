public class exception_propagation {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        System.out.println(10/0);
    }
}
