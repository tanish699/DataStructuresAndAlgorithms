package BinarySearch;

public class squareRootUsingBinarySearch {
    static int squareRootFloor(int x){
        int start = 0;
        int end = x;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int sq = mid*mid;
            if(sq==x){
                return mid;
            } else if(sq>x){
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }   
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(squareRootFloor(101));
    }
    
}
