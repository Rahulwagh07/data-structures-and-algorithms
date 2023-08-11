import java.util.ArrayList;

public class SubsetofArray{
    public String isSubset( long a1[], long a2[], long n, long m) {
        ArrayList<Long> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(a1[i]);
        }
        for(int i=0; i<m; i++){
            if(list.contains(a2[i])){
                list.remove(a2[i]);
            } else{
                return "No";
            }
        }
        return "Yes";
        
    }
}