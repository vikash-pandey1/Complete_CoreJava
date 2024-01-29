public class Recursivefactorial {
    static int s(int no){
        if(no==1)
        return 1;
        else
        return no*s(no-1);
    }
    public static void main(String[] args) {
        System.out.println(s(5));
    }
}
