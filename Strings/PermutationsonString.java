import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationsonString {
    public List<String> find_permutation(String S) {
        List<String> res = new ArrayList<>();
        boolean[] used = new boolean[S.length()];
        backtrack(S, res, "", used);
        Collections.sort(res);
        return res;
    }
    public static void backtrack(String s, List<String> res, String current, boolean[] used){

        if(s.length() == current.length()){
            if(!res.contains(current)){
                res.add(current);
            }
             
            return;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(used[i]){
                continue;
            }
            used[i] = true;
            current += ch;
            backtrack(s, res, current, used);
            current = current.substring(0, current.length()-1);
            used[i] = false;
        }
    }
}
