class threadp extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(i);
        }
    }
}
class threadc extends Thread{
    public void run(){
        for(int i=3;i>=1;i--){
            System.out.println(i);
        }
    }
}
public class join {
    public static void main(String[] args) {
        threadp t = new threadp();
        threadc t1 = new threadc();
        t.start();
        try {
            t.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t1.start();
    }
}