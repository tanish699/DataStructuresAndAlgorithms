package Arrays;

public class frequencyInSortedArray {
    static void findFrequency(int[] arr){
        int i=1;
        int freq=1;
        while(i<arr.length){
            while(i<arr.length&&arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+": "+freq);
            i++;
            freq = 1;

        }
        int n=arr.length;
        if(n==1||arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1]+": "+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,10,20,30,30,40,50,60,60,60,70};
        findFrequency(arr);
    }
    
}
