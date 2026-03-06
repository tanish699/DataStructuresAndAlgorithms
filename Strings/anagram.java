package Strings;

public class anagram {
    static final int CHAR= 256;
    static boolean isAnagram(String string1, String string2){
        if(string1.length()!=string2.length()) return false;
        int[] count = new int[CHAR];
        for(int i = 0;i<string1.length();i++){
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;
        }

        for(int x:count){
            if(x!=0) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ABCDEFGH", "HGFEDCBA"));
    }
    
}
