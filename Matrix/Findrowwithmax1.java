 

//like weakest soldier // row is sorted;
public class Findrowwithmax1 {
    int rowWithMax1s(int arr[][], int n, int m) {
        //  int row =0;
        //  int col = 0;
        //  while(row < n && col < m){
        //      if(arr[row][col] == 1){
        //          return row;
        //      }
        //      if(row == n-1){
        //          col++;
        //      }
        //  }
        //  return -1;
        for(int i=0; i<m; i++){
            for(int row=0; row<n; row++){
                if(arr[row][i] == 1){
                    return row;
                }
            }
        }
        return -1;
    }
}
