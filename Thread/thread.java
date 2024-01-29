
class check extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
        System.out.println("thread method is running ");}
    }
}
public class thread {
    public static void main(String[] args) {
        check c = new check();
        c.start();
        for(int i=1;i<=5;i++){
            System.out.println("main thread is running ");}
    }
}
