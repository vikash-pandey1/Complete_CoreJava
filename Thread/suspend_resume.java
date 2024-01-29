class resume extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(i);
        }
    }
}
class resume1 extends Thread{
    public void run(){
        for(int i=3;i>=1;i--){
            System.out.println(i);
        }
    }
}
public class suspend_resume {
    public static void main(String[] args){
        resume r = new resume();
        resume1 r1 = new resume1();
        r.start();
        r1.start();
    }
}
