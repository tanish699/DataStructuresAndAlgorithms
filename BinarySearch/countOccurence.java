package BinarySearch;

public class countOccurence {
    static int CountOcc(int[] arr, int k){
        int firstOc = indexOfFirstOccurence.firstOccurence(arr, k);
        if(firstOc==-1) return 0;
        return ((indexOfLastOccurence.lastOccurence(arr, k) - firstOc) +1);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,2,3,4,5,6,7,8};
        System.out.println(CountOcc(arr, 1));
    }
}
