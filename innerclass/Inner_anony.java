abstract class outer{
    abstract void m();
}
public class Inner_anony {
    public static void main(String[] args) {
        outer o = new outer() {
            void m(){
                System.out.println("welcome to anonymous class");
            }
        };
        o.m();
    }
}
