package exception_with_method_override;
class parent6{
    void m() throws Exception{
        System.out.println("welcome to parent method ");
    }
}
public class rule6  extends parent6{
    void m(){
        System.out.println("welcome to chied method");
    }
    public static void main(String[] args) throws Exception {
        parent6 p = new rule6();
        p.m();
    }
}
