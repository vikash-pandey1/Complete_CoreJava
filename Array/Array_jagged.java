public class Array_jagged {
    public static void main(String[] args) {
        /*int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){      // print of multi dimentional arrays
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int arr [][] = new int [3][];
        arr [0] = new int [3];
        arr [1] = new int [4];
        arr [2] = new int [2];
        int count =0;
        for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr[i].length;j++)
        arr[i][j] = count++;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++ ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
