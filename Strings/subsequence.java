package Strings;



public class subsequence {
    static boolean isSubsequence(String mainString, String subString){
        if(mainString.length()<subString.length()) return false;
        int j = 0;
        for(int i=0;i<mainString.length()&&j<subString.length();i++){
            if(mainString.charAt(i)==subString.charAt(j)){
                j++;
            }
        }

        return (j==subString.length());
    }

    public static void main(String[] args) {
        String s1 = "ABCDEFG";
        String s2 = "BCFG";
        System.out.println(isSubsequence(s1, s2));
    }
    
}
