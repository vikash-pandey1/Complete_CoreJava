
public class priority_thread extends Thread {
    public void run(){
        System.out.println("inside the run method");
    }
    public static void main(String[] args) {
        priority_thread p = new priority_thread();
        priority_thread p1 = new priority_thread();
        priority_thread p2 = new priority_thread();
        System.out.println("p thread is running "+p.getPriority());
        System.out.println("p1 thread is running "+p1.getPriority());
        System.out.println("p2 thread is running "+p2.getPriority());
        p.setPriority(3);
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println("p thread is runnign "+p.getPriority());
        System.out.println("p1 thread is running "+p1.getPriority());
        System.out.println("p2 thread is running "+p2.getPriority());
        System.out.println(Thread.currentThread().getName());
        //System.out.println(Thread.currentThread().getName());

    }
}
