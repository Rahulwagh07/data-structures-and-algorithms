import java.util.*;

public class CommonEleInallRow {
    public static void printCommonElements(int mat[][], int N, int M){
    Map<Integer,Integer> map = new HashMap<>();
      
    // initialize 1st row elements with value 1
    for (int j = 0; j < N; j++)
        map.put(mat[0][j],1);
          
    // traverse the matrix
    for (int i = 1; i < M; i++)
    {
        for (int j = 0; j < N; j++)
        {
            // If element is present in the map and
            // is not duplicated in current row.
            if (map.get(mat[i][j]) != null && map.get(mat[i][j]) == i)
            {
                // we increment count of the element
                // in map by 1
                map.put(mat[i][j], i + 1);
  
                // If this is last row
                if (i == M - 1)
                    System.out.print(mat[i][j] + " ");
            }
        }
    }
    }
    public static void main(String[] args) {
        int arr[][] =
    {
        {1, 2, 1, 4, 8},
        {3, 7, 8, 5, 1},
        {8, 7, 7, 3, 1},
        {8, 1, 2, 7, 9},
    };
    int M = arr.length;
    int N = arr[0].length;
    printCommonElements(arr, N, M);
 
    }
}
