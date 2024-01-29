public class Arraytest {
    static int sum(){
        int arr[] = {38,403,395,3030,0303};
        int s=0;
        for(int i=0;i<arr.length;i++)
        s+=arr[i];
        return s;
    }
    public static void main(String[] args) {
        System.out.println(sum());
    }
}