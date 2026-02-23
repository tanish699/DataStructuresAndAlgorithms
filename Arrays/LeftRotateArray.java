package Arrays;
import java.util.Arrays;

public class LeftRotateArray {
    static void roatateArray(int[] arr){
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
    }

    static void roatateArray(int[] arr, int D){
        if(D>arr.length){
            D=arr.length-D;
        }
        reverseArray.reverse(arr, 0, D-1);
        reverseArray.reverse(arr, D, arr.length-1);
        reverseArray.reverse(arr);

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        roatateArray(arr);
        System.out.println(Arrays.toString(arr));
        roatateArray(arr, 2);
        System.out.println(Arrays.toString(arr));


    }
}
