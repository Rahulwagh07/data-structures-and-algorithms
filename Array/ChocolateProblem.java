import java.util.ArrayList;
import java.util.Collections;

public class ChocolateProblem {
      public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (m > n) {
            return -1; // Not enough packets to distribute to all students
        }

        Collections.sort(a);

        long minDifference = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            long diff = a.get(i + m - 1) - a.get(i);
            minDifference = Math.min(minDifference, diff);
        }

        return minDifference;
    
    }
}
