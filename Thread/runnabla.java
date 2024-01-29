class runn implements Runnable{
    public void run(){
        System.out.println("method 1 is running ");
    }
}
class runn1 implements Runnable{
    public void run(){
        System.out.println("method 2 is running");
    }
}
public class runnabla {
    public static void main(String[] args) {
        runn r = new runn();
        Thread t = new Thread(r);
        runn1 r2 = new runn1();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}
