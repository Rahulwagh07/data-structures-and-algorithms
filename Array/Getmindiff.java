// Given an array arr[] denoting heights of N towers and a positive integer K.

// For each tower, you must perform exactly one of the following operations exactly once.

// Increase the height of the tower by K
// Decrease the height of the tower by K

import java.util.Arrays;
          //most IMP 
public class Getmindiff {
     int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        
        int ans = arr[n-1] - arr[0];
        
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;
        int min, max;
        
        for(int i=0; i<n-1; i++){
            min = Math.min(smallest, arr[i+1] - k);
            max = Math.max(largest, arr[i]+k);
            if(min < 0){
                continue;
            }
            ans = Math.min(ans, max-min);
        }
        return ans;
        
    }
}

          //not work
//  int getMinDiff(int[] arr, int n, int k) {
//         for(int i=0; i<n; i++ ){
//             if(arr[i] - k <= 0){
//                 arr[i] = arr[i] + k;
//             }
//             else{
//                 arr[i] = arr[i] - k;
//             }
//         }
//         Arrays.sort(arr);
//         return arr[n-1] - arr[0];
        
    
