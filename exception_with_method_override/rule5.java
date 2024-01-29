package exception_with_method_override;


class parent5{
    void m() throws Exception{
        System.out.println("welcome to parent class exception");
    }
}
public class rule5 extends parent5 {
    void m() throws ArithmeticException{
        System.out.println("welcome to parent class method 5");
    }
    public static void main(String[] args)throws Exception {
        parent5 p = new rule5();
        p.m();
    }
}
