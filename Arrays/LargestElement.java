package Arrays;

public class LargestElement {
    static int indexOfLargest(int[] arr){
        int res = 0;
        for(int i=1;i<arr.length;i++){
            res = arr[res]<arr[i]?i:res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {9,77,3,55,22,97,35,8,3,2,4,57,5,77,45,47,45,7,8,9,};
        System.out.println(indexOfLargest(arr));
    }
    
}
