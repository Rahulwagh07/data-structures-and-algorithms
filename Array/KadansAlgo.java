public class KadansAlgo {
    long maxSubarraySum(int arr[], int n){
        long maxSum = Long.MIN_VALUE;
        long currSum = 0;
    
        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
        }
}
