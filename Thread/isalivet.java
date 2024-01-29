public class isalivet  extends Thread{
    public void run(){
        System.out.println("isAlive method program");
    }
    public static void main(String[] args) {
        isalivet a = new isalivet();
        isalivet a1 = new isalivet();
        System.out.println(a.isAlive());
        a.start();
        System.out.println(a.isAlive());
        System.out.println(a1.isAlive());
        a1.start();
        System.out.println(a1.isAlive());

        
    }
}
