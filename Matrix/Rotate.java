 
//first transpose by swapping and then swap first col with last-> i, j = i, m-1-j
public class Rotate {
    public static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j =i; j < matrix[0].length; j++) {
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j =0; j < matrix[0].length/2; j++) {
                int temp =  matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length -1 - j];
                matrix[i][matrix[0].length -1 - j] = temp;
            }
        }
    }
}
