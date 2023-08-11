import java.util.ArrayList;
import java.util.HashSet;
  
//to do -> optimize in sc O(1)
public class CommonElein3sortedArrays {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<A.length; i++){
            set1.add(A[i]);
        }
        for(int i=0; i<B.length; i++){
            if(set1.contains(B[i])){
                set2.add(B[i]);
            }
        }
        for(int i=0; i<C.length; i++){
            if(set2.contains(C[i])){
                if(!list.contains(C[i])){
                    list.add(C[i]);
                }
                 
            }
        }
        return list;
    }
}
