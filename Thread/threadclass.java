class thread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("thread 1 is running");
            i++;
        }
    }
}
class thread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<=5){
            //Thread.sleep(1000);
            System.out.println("thread 2 is running");
            i++;
        }
        
        
    }
    
}
public class threadclass {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        
    }
}
