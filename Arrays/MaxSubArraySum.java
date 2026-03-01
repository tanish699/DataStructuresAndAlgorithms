package Arrays;

public class MaxSubArraySum {
    static int maxSun(int[] arr){
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-3,8,-2,4,-5,6};
        System.out.println(maxSun(arr));
    }
    
}
