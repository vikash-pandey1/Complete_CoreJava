
public class Inner_local {
    private int data = 10;
    void display(){
        class local
        {
            void msg(){
                System.out.println(data);
            }
        }
        local l = new local();
            l.msg();
    }
    public static void main(String[] args) {
        Inner_local l = new Inner_local();
        l.display();
    }
}
