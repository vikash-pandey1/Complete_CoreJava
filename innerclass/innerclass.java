public class innerclass {
    static int  x = 10;
    static class inner{
        void m1(){
            System.out.println("welcome to inner class :"+x);
        }
    }
    public static void main(String[] args) {
        //innerclass i = new innerclass();
        //innerclass.inner i1 = i.new inner();  // use when inner class is non static 
        innerclass.inner i = new innerclass.inner();     // use when inner class is static 
        i.m1();
    }
}
