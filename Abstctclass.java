// abstract class Animal1{
//     abstract void run();
// }
// public class Abstctclass extends Animal1 {     // abstract class example
//     void run(){
//         System.out.println("running safely");
//     }
//     public static void main(String[] args) {
//         Animal1 a = new Abstctclass();
//         a.run();
//     }
// }





// abstract class shape{
//     abstract void run();
// }
// class Rectangle extends shape{
//     void run(){
//         System.out.println("shape ractangle");
//     }
// }
// class Circle extends shape{
//     void run(){
//         System.out.println("abstctclass is shape");
//     }  
// }
// public class Abstctclass  {
//     public static void main(String[] args) {
//         shape s = new Circle();
//         s.run();
//     }
// }

abstract class Animal{
    Animal(){  // construction
        System.out.println("construction is running ");
    }
    abstract void run();  // abstract method
    void gear(){
        System.out.println("non abstract method is running ");
    }
}
class Dog extends Animal{
    void run(){
        System.out.println("abstract method is running ");
    }
}
public class Abstctclass{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.run();
        a.gear();
    }
}
