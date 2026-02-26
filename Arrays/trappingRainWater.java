package Arrays;

public class trappingRainWater {
    static int getWater(int[] Blocks){
        int n = Blocks.length;
        int[] LMax = new int[n];
        int[] RMax = new int[n];
        int res = 0;
        LMax[0]=Blocks[0];
        RMax[n-1]=Blocks[n-1];
        for(int i=1;i<n;i++){
            LMax[i] = Math.max(LMax[i-1], Blocks[i]);
        }
        for(int i=n-2;i>=0;i--){
            RMax[i] = Math.max(RMax[i+1], Blocks[i]);
        }
        for(int i=1;i<n;i++){
            res += ((Math.min(LMax[i], RMax[i]))-Blocks[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5,0,6,2,3};
        System.out.println(getWater(arr));
    }
}
