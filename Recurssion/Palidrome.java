package Recurssion;

public class Palidrome {
    
    static boolean isPalidrome(String str, int start, int end){
        if(start>=end){
            return true;
        }

        return (str.charAt(start)==str.charAt(end))&&isPalidrome(str, start+1, end-1);
    }

    public static void main(String[] args) {
        String str = "civic";
        System.out.println(isPalidrome(str,0,str.length()-1));
    }
}
