package BinarySearch;

public class RepeatingElementPartOne {
    static int findRepatingElement(int[] arr){
       boolean[] boolArray = new boolean[arr.length];
       for(int i = 0;i<arr.length;i++){
        if(!boolArray[arr[i]]){
            boolArray[arr[i]] = true;
        } else {
            return arr[i];
        }
       }
       return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,7};
        System.out.println(findRepatingElement(arr));
    }
    
}
