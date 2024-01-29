class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}
public class methodride extends vehicle {
    void run(){
        System.out.println("main method is running");
    }
    public static void main(String[] args) {
        //vehicle m = new vehicle();
        methodride m1 = new methodride();
        //m.run();
        m1.run();
    }
}
// class Bank{
//     int rate(){
//         return 0;
//     }
// }
// class Sbi extends Bank{
//     int rate(){return 8;}
// }
// class Axis extends Bank{
//     int rate(){return 7;}
// }
// class Icici extends Bank{
//     int rate(){return 9; }
// }

// public class methodride{
//     public static void main(String[] args) {
//         Sbi s = new Sbi();
//         Axis a = new Axis();
//         Icici i = new Icici();
//         System.out.println(s.rate());
//         System.out.println(a.rate());
//         System.out.println(i.rate());
//     }
// }
