public class Recursion_fibonocci {
   static int set(int n)
    {
        if(n==0||n==1)
        return n;
        return set(n-1)+set(n-2);

    }

    public static void main(String[] args) {
        for(int i=0;i<7;i++)
        System.out.println(set(i));
    }
}
