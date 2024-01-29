// class Bike{
//     void run(){System.out.println("bike is running");}
// }
// class Splender extends Bike{       // example of polymorphism
//     void run(){System.out.println("splender is running ");}
// }
// public class Poly {
//     public static void main(String[] args) {
//         Bike b = new Splender();
//         b.run();
//     }
// }
// class main{
//     int limit = 100;
// }
// public class Poly extends main{                polymorphism is not achieve by data member
//     int limit = 190;
//     public static void main(String[] args) {
//         main p = new Poly();
//         System.out.println(p.limit);
//     }
// }
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void eat(){System.out.println("dog eating...");}
}
class BabyDog extends Dog{
    void eat(){System.out.println("babydog is drinking");}
}
public class Poly extends BabyDog{
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal a1 = new Dog();
        Animal a2= new BabyDog();
        a.eat();
        a1.eat();
        a2.eat();
    }
}
