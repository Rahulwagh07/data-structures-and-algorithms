import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        Arrays.sort(strs);
        String ans = "";
        int minStrLength= Math.min(strs[0].length(), strs[n-1].length());

        int i =0;
        while(i < minStrLength && strs[0].charAt(i) == strs[n-1].charAt(i)) {
            i++;

            ans = strs[0].substring(0, i);
             
        }
        return ans;

    }
}
