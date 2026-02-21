package Arrays;

public class sortedArray {

    static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {9,77,3,55,22,97,35,8,3,2,4,57,5,77,45,47,45,7,8,9,};
        System.out.println(isSorted(arr));
    }
    
}
