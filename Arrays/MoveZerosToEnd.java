package Arrays;

public class MoveZerosToEnd {

    static void moveZeros(int[] arr){
        int count=0;
       for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
             Swap.swap(arr, i, count);
             count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,0,4};
        moveZeros(arr);
        for(int x:arr){
            System.out.print(x);
        }
    }
    
}
