package exception_with_method_override;
class supertest{
    void m(){
        System.out.println("welcome to parent class method ");
    }
}
public class rule1 extends supertest {
    void m() throws ArithmeticException{
        System.out.println("welcome to child class method");
    }
    public static void main(String[] args) {
        supertest t = new rule1();
        t.m();
    }
}
