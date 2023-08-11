
//kadans algo  imp-- 

public class LargestsumContiArr {
    long maxSubarraySum(int arr[], int n){
        long maxSum = Long.MIN_VALUE;
        long currSum = 0;
    
        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
        }
        // for(int i=0; i<nums.length; i++) {
        //     currSum = currSum + nums[i];

        //     if(currSum < 0){
        //         currSum = 0;
        //     }
        //     maxSum = Math.max(currSum, maxSum);
        // }
}
