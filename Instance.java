
// public class Instance {
//     public static void main(String[] args) {
//         Instance i = new Instance();
//         System.out.println(i instanceof Instance);   // instance of operator
//     }
// }
class Animal{}
public class Instance extends Animal{
    static void method(Animal a){
        if(a instanceof Instance){
            Instance d = (Instance)a;
            System.out.println("ok downcasting performed ");
        }
    }
    public static void main(String[] args) {
        Animal a = new Instance();
        Instance.method(a);
    }
}

