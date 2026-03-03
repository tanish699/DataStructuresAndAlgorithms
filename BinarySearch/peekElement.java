package BinarySearch;

public class peekElement {
    /*
    Give a un Sorted array
    Peek element is an element which is not Smaller then its neighbours
    */
    public static boolean isPeek(int[] arr,int index){
        return ((index==0)||(arr[index]>=arr[index-1]))&&((index==arr.length-1)||(arr[index]>=arr[index+1]));
    }

    static int findPeekElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
       while(start<=end){
            int mid = start + (end-start) /2;
            if(isPeek(arr, mid)){
             return mid;
            }
            if(mid>0&&arr[mid-1]>=arr[mid]){
               end = mid - 1;
            } else {
              start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,20,40,30,20,50,60};
        int peekElement = (findPeekElement(arr));
        System.out.println("Index : "+ peekElement +", Value : " + arr[peekElement]);
    }
    
}
