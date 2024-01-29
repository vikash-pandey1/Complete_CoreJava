public class Recursion {
    // static void s(){
    //     System.out.println("helllo");
    //     s();
    // }
    static int  no =0;
    static void s(){
        no++;
        if(no<=5){
            System.out.println(no);
            s();
        }
    }
    public static void main(String[] args) {
        s();
    }
}
