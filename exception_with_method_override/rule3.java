package exception_with_method_override;
import java.io.IOException;

class super3{
    void m() throws IOException {
        System.out.println("welcome to super class method 3");
    }
}
public class rule3 extends super3 {
    void m() throws Exception{
        System.out.println("welcome to child class method");
    }
    public static void main(String[] args) {
        super3 s = new rule3();
        s.m();
    }
}
