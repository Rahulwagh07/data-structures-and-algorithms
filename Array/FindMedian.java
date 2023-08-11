import java.util.Arrays;

public class FindMedian {
     public int find_median(int[] v)
    {
        int n = v.length;
        Arrays.sort(v);
        if(n % 2 != 0){
            return v[n/2];
        } else{
            int midIndex = n/2;
            int mid = (v[midIndex] + v[midIndex-1])/2;
            return mid ;
        }
    }
}
