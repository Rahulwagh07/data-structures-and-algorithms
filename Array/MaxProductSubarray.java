import java.util.*;
//imp
public class MaxProductSubarray {
    
    public static long maxProduct(int[] arr, int n) {
        long maxP = arr[0];
        long currMax = arr[0];
        long currMin = arr[0];
    
         for(int i=1; i< n; i++){
            long temp = Math.max(Math.max(arr[i], arr[i] * currMax), arr[i] * currMin);
            currMin = Math.min(Math.min(arr[i], arr[i] * currMax), arr[i] * currMin);
            currMax = temp;
    
            maxP = Math.max(maxP, currMax);
    
         }
        return maxP;
    }
    public static void main(String[] args) {
        int arr[] =  { 1, -2, -3, 0, 7, -8, -2 };
        System.out.println(maxProduct(arr, arr.length));

    }
}
