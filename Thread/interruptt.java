public class interruptt extends Thread {
    public void run(){
        try {
            for(int i=1;i<=5;i++){

                System.out.println(i);
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println("t1 thred terminated");
        }
    }
    public static void main(String[] args) {
        interruptt i = new interruptt();
        i.start();
        i.interrupt();
    }
}
