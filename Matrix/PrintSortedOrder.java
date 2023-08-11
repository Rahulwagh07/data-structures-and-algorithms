import java.util.*;
//Print elements in sorted order using row-column wise sorted matrix
public class PrintSortedOrder{
public  int[][] sortedMatrix(int N, int Mat[][]) {
    int idx = 0;
    int arr[] = new int[N * N];
    for(int i=0; i<Mat.length; i++){
        for(int j=0 ; j<Mat[0].length; j++){
            arr[idx] = Mat[i][j]; 
            idx++;
        }
    }
    Arrays.sort(arr);
    idx=0;
    for(int i=0; i<Mat.length; i++){
        for(int j=0 ; j<Mat[0].length; j++){
            Mat[i][j] = arr[idx];
            idx++;
        }
    }
    return Mat;
    
}  
public static void main(String[] args) {
    
}
}