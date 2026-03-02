package BinarySearch;

public class indexOfFirstOccurence {
    public static int firstOccurence(int[] arr, int num){
       int start = 0;
       int end = arr.length-1;
       while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>num){
                end = mid-1; 
            } else if(arr[mid]<num){
                start = mid+1;
            }else{
                if(mid==0||arr[mid-1]!=arr[mid]){
                    return mid;
                } else{
                    end = mid-1;
                }
            } 
        }
       return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6,7,8};
        System.out.println(firstOccurence(arr, 4));
    }
    
}
