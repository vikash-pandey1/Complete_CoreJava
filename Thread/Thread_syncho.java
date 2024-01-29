class Bus implements Runnable{
    int available =2,passenger;
    Bus(int passenger){
        this.passenger=passenger;
    }
    public synchronized void run(){
        String name = Thread.currentThread().getName();
        if(available>=passenger){
            System.out.println(name+" reserved seat");
            available-=passenger;
        }
        else{
            System.out.println("sorry seat not available");
        }
    }
}
public class Thread_syncho {
    public static void main(String[] args) {
        Bus b = new Bus(1);
        Thread t = new Thread(b);
        Thread t1 = new Thread(b);
        Thread t2 = new Thread(b);
        t.setName("vikash");
        t1.setName("pandey");
        t2.setName("viaksh pandey");
        t.start();
        t1.start();
        t2.start();
    }
}
