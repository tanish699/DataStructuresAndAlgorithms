package BinarySearch;

public class seacrchInInfiniteLength {
    static int search(int[] arr, int target){
        if(arr[0]==target) return 0;
        int i = 1;
        while(arr[i]<target){
            if(arr[i]==target) return i;
            i *= 2;
        }
        return binarySearchIterative.binarySearch(arr, target, i/2+1, i-1);
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for(int i = 0;i<arr.length;i++){
            arr[i] = i*2;
        }
        System.out.println(search(arr, 1001));
        
    }
    
}
