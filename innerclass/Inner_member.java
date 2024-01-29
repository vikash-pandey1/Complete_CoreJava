public class Inner_member{
    int data = 49;
    class inner{
        void test(){
            System.out.println("welcome to inner class :"+data);
        }
    }
    public static void main(String[] args) {
        Inner_member m = new Inner_member();
        Inner_member.inner m1 = m.new inner();
        m1.test(); 
    }
}
