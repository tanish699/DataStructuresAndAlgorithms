package Arrays;

public class leaderInAnArray {
    
    static void findLeaders(int[] arr){
        int currLeader = arr[arr.length-1];
        System.out.println(currLeader);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>currLeader){
                currLeader = arr[i];
                System.out.println(currLeader);
            } 
        } 
    }

    public static void main(String[] args) {
        int[] arr = {7,10,3,5,6,2};
        findLeaders(arr);
    }
}
