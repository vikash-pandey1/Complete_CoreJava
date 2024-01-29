class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public void run(){
        int i=10;
        System.out.println("thank you "); 
        // while(true){
        //     System.out.println("i am in thread");
        // // }
    }
}
public class thread_constructor {
    public static void main(String[] args) {
        mythread t = new mythread("vikash");
        t.start();
        System.out.println("the id of the thread is "+t.getId());
        System.out.println("the name of the thread is "+t.getName());
    }
}
