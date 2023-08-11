//to do  ->> optimize it using DP

public class lonPalindromic {
    public String longestPalindrome(String s) {  //O(n^3)
        String ans = s.substring(0, 1);
        int n = s.length();
        if(n == 1){
            return s;
        }
        if(n == 2){
        ans = s.substring(0, n-1);
        if(s.charAt(0) == s.charAt(1)){
            return s;
        } else {
                return ans;
        }
    }
      
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                String curr = s.substring(i, j+1);
                if(isPalindrome(curr)){
                    if(curr.length() > ans.length()){
                        ans = curr;
                    }
                }
            }
        }
        return ans;
    }
    public boolean isPalindrome(String curr){
        int n=  curr.length();
        for(int i=0; i<n/2; i++){
            if(curr.charAt(i) != curr.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
