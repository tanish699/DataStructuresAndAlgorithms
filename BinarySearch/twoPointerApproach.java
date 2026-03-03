package BinarySearch;

public class twoPointerApproach {
    // Given a sorted array and a num k find a pair with sum == k;
    static boolean findSum(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum>k){
                end--;
            } else if(sum<k){
                start++;
            }else if(sum==k){
                return true;
            }
        }
        return false;
    }

    public static boolean findSum(int[] arr, int k, int start, int end){
        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum>k){
                end--;
            } else if(sum<k){
                start++;
            }else if(sum==k){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,8,12,30};
        System.out.println(findSum(arr, 17));
    }
}
