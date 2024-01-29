class Bank extends Thread{
    static int bal = 5000;
    static int withdraw;
    Bank(int withdraw){
        this.withdraw=withdraw;
    }
    public static  synchronized void Withdraw(){
        String name = Thread.currentThread().getName();
        if(withdraw<=bal){
            System.out.println(name+" withdrawn money");
            bal-=withdraw;
        }
        else
        System.out.println("insufficient balance");
    }
    public void run(){
        Withdraw();
    }
}
public class thread_synchro {
    public static void main(String[] args) {
        Bank obj = new Bank(2500);
        Thread t = new Thread(obj);
        Thread t1 = new Thread(obj);
        t.setName("raju");
        t1.setName("shivani");
        Bank obj2 = new Bank(4000);
        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);
        t3.setName("raju pandey");
        t4.setName("shivani pandey");
        t3.start();
        t4.start();
        t.start();
        t1.start();
    }
}
