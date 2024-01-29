package exception_with_method_override;

import java.io.IOException;

class parent4{
    void m() throws IOException{
        System.out.println("welcome to parent class 4 method exception");
    }
}
public class rule4 extends parent4 {
    void m() throws IOException{
        System.out.println("welcome to child class method exception");
    }
    public static void main(String[] args) throws IOException {
        parent4 p = new rule4();
        p.m();
    }
}
