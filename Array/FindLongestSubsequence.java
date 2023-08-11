import java.util.Arrays;

public class FindLongestSubsequence {
    	static int findLongestConseqSubseq(int arr[], int N) {
        if (N == 0) {
            return 0;
        }
        
        Arrays.sort(arr);
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentCount++;
            } else if (arr[i] != arr[i - 1]) {
                currentCount = 1;
            }
            
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }
}
