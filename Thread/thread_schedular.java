class schedular implements Runnable{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("thread 1 is running ");
        }
    }
}
class schedular1 implements Runnable{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("thread 2 is running ");
        }
    }
}
public class thread_schedular {
    public static void main(String[] args) {
        schedular s = new schedular();
        schedular1 s1 = new schedular1();
        Thread t = new Thread(s);
        Thread t1 = new Thread(s1);
        
        try {
        Thread.sleep(1000);
        t.start();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            
        Thread.sleep(1000);
        t1.start();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
}
