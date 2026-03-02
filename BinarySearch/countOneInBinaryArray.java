package BinarySearch;

public class countOneInBinaryArray {
    static int countOne(int[] arr){
        int one = 0;
        one = arr.length - indexOfFirstOccurence.firstOccurence(arr, 1);
        return one;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,1};
        System.out.println(countOne(arr));
    }
    
}
