import java.util.Arrays;

public class MedianinRowwiseSortedMatrix {
    int median(int matrix[][], int R, int C) {
        int arr[] = new int[R * C];
        int n = arr.length;
        int idx = 0;
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                arr[idx] = matrix[i][j];
                idx++;
            }
        }
        Arrays.sort(arr);
        return arr[n/2];
    }
}
