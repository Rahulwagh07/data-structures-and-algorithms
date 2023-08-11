import java.util.ArrayList;

public class CountPalindromicSubseq {
    
    long countPS(String str)
    {    long count = 0;
         findSubSeq(str, "");
         for(int i=0; i<list.size()-1; i++){
             String s = list.get(i);
             if(isPalindrome(s)){
                 count++;
             }
         }
         return count;
    }
    static ArrayList<String> list = new ArrayList<>();
    public static void findSubSeq(String s, String ans){
        int n = s.length();
        if(n == 0){
            list.add(ans);
            return;
        }
        findSubSeq(s.substring(1), ans+s.charAt(0));
        findSubSeq(s.substring(1), ans);

    }
    public static boolean isPalindrome(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
