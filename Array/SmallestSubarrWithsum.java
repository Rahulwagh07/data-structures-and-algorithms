public class SmallestSubarrWithsum {
    public static int smallestSubWithSum(int a[], int n, int x) {
        int minLength = n +1; //initilize large value
        int start = 0;
        int currsum = 0;
        
        for(int i=0; i<n; i++){  //i -> end
            currsum = currsum + a[i];
            while(currsum > x){
                minLength = Math.min(minLength, i-start+1);
                currsum -= a[start];
                start++;
            }
        }
        return minLength == n +1 ? 0 : minLength;
    }
}
