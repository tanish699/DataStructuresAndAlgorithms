package Recurssion;

public class PrintNToOne {
    
    static void PrintN(int n){
        if(n==0) return;
        System.out.println(n);
        PrintN(n-1);
    }


    public static void main(String[] args) {
        PrintN(10);
    }
    
}
