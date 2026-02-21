package Arrays;

public class SecondLargestElement {
    static int indexOfSecondLargest(int[] arr){
        int lar = 0;
        int secondLar = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[lar]<arr[i]){
                secondLar = lar;
                lar=i;
            }
        }
        return secondLar;
    }

    public static void main(String[] args) {
        int[] arr = {9,77,3,55,22,97,35,8,3,2,4,57,5,77,45,47,45,7,8,99};
        System.out.println(indexOfSecondLargest(arr));
    }
    
}
