interface showable{
    void show();
    interface message{
        void msg();
    }
}
public class inner_interface implements showable.message {
    public void msg(){
        System.out.println("welcome to nested interface inside the interface");
    }
    public static void main(String[] args) {
        showable.message message = new inner_interface();
        message.msg();
    }
}
