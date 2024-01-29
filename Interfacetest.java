// interface A{
//     void  a();
//     void b();
//     void c();
//     void d();
 
// }
//  abstract class B implements A{
//     public void a(){
//         System.out.println("a is running..");
//     }
// }
// class C extends B{
//     public  void b(){
//         System.out.println(" b is running..");
//     }
//     public void c(){
//         System.out.println("c is running..");
//     }
//     public void d(){
//         System.out.println("d is running ");
//     }
// }
// class Interfacetestp {
//     public static void main(String[] args) {
//         A a = new C();
//         a.a();
//         a.b();
//         a.c();
//         a.d();
        
//     }
// }
interface A{
    void a();
    void b();
    void c();
    void d();
    }
    
    abstract class B implements A{
    public void c(){System.out.println("I am C");}
    }
    
    class M extends B{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
    }
public class Interfacetest{
    public static void main(String args[]){
    A a=new M();
    a.a();
    a.b();
    a.c();
    a.d();
    }}
