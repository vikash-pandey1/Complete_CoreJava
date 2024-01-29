public class Inner_static2 {
    static int data = 20;
    static class inner{
        static void msg(){
            System.out.println("welcome to nested static class");
        }
    }
    public static void main(String[] args) {
        Inner_static2.inner.msg();
    }
}
