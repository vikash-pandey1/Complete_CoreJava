abstract class parent{
    abstract void  print();
}
abstract class child extends parent{
    //int i =10;
    void print(){
        System.out.println("child method is running");
    }
}
public class convert {
    void print(){
        System.out.println("parent method is running");
    }
    public static void main(String[] args) {
        child c = new child();
        //child c = new child()
    //     String str = "67";
    //     double d = Double.parseDouble(str);
    //     System.out.println(d);
    // String s = "vikash";
    // System.out.println(s.charAt(1));
    }
}
