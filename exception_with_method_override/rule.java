package exception_with_method_override;

import java.io.IOException;

class supertest1{
    void m(){
        System.out.println("welcome to parent class method ");
    }
}
public class rule extends supertest1 {
    void m() throws IOException{
        System.out.println("welcome to child class method");
    }
    public static void main(String[] args) {
        supertest1 t = new rule();
        t.m();
    }
}
