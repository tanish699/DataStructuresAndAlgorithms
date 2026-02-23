package Arrays;

public class reverseArray {


    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
          Swap.swap(arr, start, end);
          start++;
          end--;
        }
    }
    static void reverse(int[] arr,int startIndex, int lastIndex){
        int start = startIndex;
        int end = lastIndex;
        while(start<=end){
          Swap.swap(arr, start, end);
          start++;
          end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverse(arr);

        for(int x:arr){
            System.out.print(x+" ");
        }

    }
    
}
