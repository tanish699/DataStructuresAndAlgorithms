package Recurssion;

public class SumOfDigits {
    static int sumD(int n){
        if(n==0) return 0;
        int digit = n%10;
        return digit+sumD(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumD(1234567891));
    }
    
}
