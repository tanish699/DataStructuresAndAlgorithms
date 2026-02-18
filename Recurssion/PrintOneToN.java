package Recurssion;

public class PrintOneToN {
    
    static void PrintOne(int n){
        if(n==0) return;
        PrintOne(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        PrintOne(10);
    }
}
