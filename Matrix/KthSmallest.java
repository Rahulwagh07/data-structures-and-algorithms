package Matrix;

import java.util.PriorityQueue;
//to do-> do once by using row wise and col wise sorted approach
public class KthSmallest {
    public static int kthSmallest(int[][] mat, int n, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
     
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    pq.add(mat[i][j]);
                }
            }
     
            int c = 0;
            while (!pq.isEmpty()) {
                int temp = pq.poll();
                c++;
     
                if (c == k)
                    return temp;
            }
            return -1;
	}
}
