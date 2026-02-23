package Arrays;

public class removeDublicatesFromArray {

    static int removeDublicate(int[] arr){
        int res  = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,20,30,40,40,50};
        for(int x: arr){
            System.out.print(x+",");
        }
        System.out.println();
        int newSize = removeDublicate(arr);
        for(int i=0;i<newSize;i++){
            System.out.print(arr[i]+",");
        }
    }
    
}
