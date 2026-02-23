package Arrays;

public class maximumDifference {
    static int maxDifference(int[] arr){
        int res = arr[1]-arr[0];
        int minEle = arr[0];
        for(int j=1;j<arr.length;j++){
            res = Math.max(res, arr[j]-minEle);
            minEle = Math.min(minEle,arr[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        System.out.println(maxDifference(arr));
    }
}
