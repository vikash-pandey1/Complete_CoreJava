class runnable1 implements Runnable{
    public void run(){
        System.out.println("runnable 1 is running ");
    }
}
class runnable2 implements Runnable{
    public void run(){
        System.out.println("runnable 2 is running");
    }
}
public class thread_Runnablet {
    public static void main(String[] args) {
        runnable1 r1 = new runnable1();
        Thread t1 = new Thread(r1);
        runnable2 r2 = new runnable2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
