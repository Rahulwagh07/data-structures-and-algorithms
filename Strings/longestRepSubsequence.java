import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class longestRepSubsequence {
 

    public static ArrayList<String> list = new ArrayList<>();

    public static void findSubSeq(String s, String ans) {
        int n = s.length();
        if (n == 0) {
            list.add(ans);
            return;
        }
        findSubSeq(s.substring(1), ans + s.charAt(0)); // Fixed recursive call
        findSubSeq(s.substring(1), ans);
    }

    public static int LongestRepeatingSubsequence(String str) {
        Set<String> set = new HashSet<>();
        int ans = -1;

        for (String s : list) {
            if (set.contains(s)) {
                ans = Math.max(ans, s.length());
            }
            set.add(s);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcd";
        findSubSeq(s, "");
        System.out.println(list);
    }
}

 