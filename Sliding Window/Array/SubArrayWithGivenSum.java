public class SubArrayWithGivenSum {

    static boolean containsSum(int[] arr, int sum){
        int start = 0;
        int curr = 0;
        for(int end=0;end<arr.length;end++){
            curr += arr[end];
            while(sum<curr){
                curr -= arr[start];
                start++;
            }
            if(curr==sum) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4,8,12,5};
        System.out.println(containsSum(arr, 18));
    }
}
