class mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("thread 1 is running");
            i++;
        }
    }
}
class mythread2 extends Thread{
    public void run(){
        int j=0;
        while(j<10){
            System.out.println("thread  2 is running");
            j++;
        }
    }
}
public class Thread_method {
    public static void main(String[] args) {
        mythread1 obj = new mythread1();
        mythread2 obj1 = new mythread2();
        obj.start();
        try {
            obj.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        obj1.start();
    }
}
