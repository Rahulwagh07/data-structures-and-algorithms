//solved on leetcode
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char arr[] = new char[n];
        for(int i=0; i<n; i++){
            int idx = indices[i];
            arr[idx] = s.charAt(i);
        }
        s = s.valueOf(arr);
        return s;

    }
}
