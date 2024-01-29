//  public class binding{
//  protected void eat(){
//         System.out.println("dog is eating "); // static binding 
//     }
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//     }
//     }
class Animal{
    void eat(){
        System.out.println("animal is eating...");
    }
}
public class binding  extends Animal{
    void eat(){
        System.out.println("dog is eating...");
    }
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
    }
}
