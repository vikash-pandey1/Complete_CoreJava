// class Add{
//     static int sum(int i,int b){
//         return i+b;             // changing the no of argument
//     }
//     static int sum(int i,int j,int k){
//         return i+j+k;
//     }
class add{
    static int sum(int a,int b){
        return a+b;
    }
    static double sum(long c,long d){    // by changing the data type 
        return c+d;
    }
}
// class Add{
//      void sum(Float a,int b){
//         System.out.println(a+b);
//     }                            // type promotion 
//      void sum(int i,int j,int k){
//         System.out.println(i+j+k);
//     }
// }

public class methodover {
    public static void main(String[] args) {

        // Add a = new Add();
        // a.sum(12f, 34);
        // a.sum(5, 5, 3);



        System.out.println(add.sum(10, 13));
        System.out.println(add.sum(38, 53));



        //System.out.println(Add.sum(12,12));
        //System.out.println(Add.sum(12, 332, 35));
    }
}
