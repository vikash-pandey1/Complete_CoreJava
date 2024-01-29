public class throwt extends Exception {
    void div(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("this is the throw exception");
        }
        else{
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args)throws ArithmeticException {
        throwt t = new throwt();
        // try {
        //     t.div(20, 0);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        t.div(20, 0);
        
    }
}
