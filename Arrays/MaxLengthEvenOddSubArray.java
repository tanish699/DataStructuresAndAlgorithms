package Arrays;

public class MaxLengthEvenOddSubArray {
    static int manEvenOdd(int[] arr){
        int res =1;
        int curr =1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]%2==0&&arr[i-1]%2!=0)||(arr[i]%2!=0&&arr[i-1]%2==0)){
                curr++;
                res = Math.max(curr, res);
            } else{
                curr = 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,7,9};
        System.out.println(manEvenOdd(arr));
    }
    
}
