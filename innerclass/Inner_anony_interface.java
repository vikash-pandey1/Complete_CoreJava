interface person{
    void m();
}
public class Inner_anony_interface {
    public static void main(String[] args) {
        person p = new person() {
            public void m(){
                System.out.println("welcome to anonymous class useing interface");
            }
        };
        p.m();
    }
}
