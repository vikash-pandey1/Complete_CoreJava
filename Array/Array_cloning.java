
public class Array_cloning {
    public static void main(String[] args) {
        int arr[] = {2,4,5,1};
        System.out.println("this is original arr");
        for(int i:arr){
            System.out.println(i);
        }
        int cln[] = arr.clone();
        System.out.println("this is clone arr");
        for(int clon:cln){
            System.out.println(clon);
        }
        System.out.println(" are they equal?");
            System.out.println(arr==cln);
    }
}
