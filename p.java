public class p {
    public static void method(int arr[],int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                arr[i] =;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,23,4,56,6,};
        method(arr, 23);
    }
}
