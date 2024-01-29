import java.io.IOException;

class A{
    void m1() throws IOException{
        System.out.println("in m1 A");
    }
}
class B extends A{
    void m2() throws IOException{
        System.out.println("in m2 B ");
    }
}
public class exception {
    public static void main(String[] args) {
        A b = new B();
        try {
            b.m1();
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
