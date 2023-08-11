import java.util.HashSet;
import java.util.Set;

public class DoUnion {  // O(n+m)  //using two set fail for large cases take that as brute force and this as optimized
    public static int doUnion(int a[], int n, int b[], int m) 
    {   int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<n; i++){
            set.add(a[i]);
        }
        for(int i=0; i<m; i++){
                set.add(b[i]);
        }
        ans = set.size();
        return ans;
    }
}
