class m{
    interface Message{
        void msg();
    }
}
public class inner_interface2 implements m.Message {
    public void msg(){
        System.out.println("welcome to interface inside the class");
    }
    public static void main(String[] args) {
        m.Message message = new inner_interface2();
        message.msg();
    }
}
