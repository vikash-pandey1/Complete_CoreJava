public class Inner_static{
    static int data = 20;
    static class outer{
        void display(){
            System.out.println("welcome to static nested class :"+data);
        }
    }
    public static void main(String[] args) {
        Inner_static.outer obj = new Inner_static.outer();
        obj.display();
    }
}
