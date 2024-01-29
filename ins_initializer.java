class A{
    A(){System.out.println("parent class construction");}
}

public class ins_initializer extends A {
    ins_initializer(){
        super();
        System.out.println("child class construction");
    }
    {
        System.out.println("instance initializer block is invoked");
    }
    public static void main(String[] args) {
        ins_initializer i = new ins_initializer();
    }
}