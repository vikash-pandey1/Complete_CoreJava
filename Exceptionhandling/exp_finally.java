public class exp_finally {
    public static void main(String[] args) {
        int a=2;
        int b =20;
        while(true){
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally{
                System.out.println(" i am finally"+b);
            }
            b--;
        }
    }
}
