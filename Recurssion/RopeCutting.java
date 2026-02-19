package Recurssion;

public class RopeCutting {
    static int MaxPieces(int n,int a,int b,int c){
        if(n==0) return 0;
        if(n<0) return -1;

        int res = Math.max(MaxPieces(n-a, a, b, c), Math.max(MaxPieces(n-b, a, b, c), MaxPieces(n-c, a, b, c)));

        if(res==-1){
            return -1;
        }
        return res+1;
    }

    public static void main(String[] args) {
        System.out.println(MaxPieces(23, 9, 11, 12));
    }
    
}
