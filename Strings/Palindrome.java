package Strings;

public class Palindrome {
    static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        if(str.length()==1) return true;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "civic";
        System.out.println(isPalindrome(str));
        String str1 = "hello";
        System.out.println(isPalindrome(str1));
    }
    
}
