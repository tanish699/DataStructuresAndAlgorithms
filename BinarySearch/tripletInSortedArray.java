package BinarySearch;

public class tripletInSortedArray {
    static boolean tripletSum(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(twoPointerApproach.findSum(arr, k-arr[start], start+1, end)){
                return true;
            } else {
                start++;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,9,20,40};
        System.out.println(tripletSum(arr, 3));
    }
    
}
