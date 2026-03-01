

public class SumOfKConsecutiveElement {
    static int KElement(int[] arr, int k){
        int currSum=0;
        for(int i = 0;i<k;i++){
            currSum+=arr[i];
        }
        int res = currSum;
        for(int i=k;i<arr.length;i++){
            currSum += arr[i];
            currSum -= arr[i-k];
            res = Math.max(currSum, res);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {1,8,30,-5,20,7};
        System.out.println(KElement(arr, 4));
    }
    
}
  