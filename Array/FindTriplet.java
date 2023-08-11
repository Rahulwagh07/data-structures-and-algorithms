import java.util.Arrays;

public class FindTriplet {
    public static boolean find3Numbers(int A[], int n, int X) { 
         Arrays.sort(A);
       

        for(int i=0; i<n-2; i++){
            int leftPointer = i+1;
            int rightPointer = n-1;
            
            while(leftPointer < rightPointer){
                int sum = A[i] + A[leftPointer] + A[rightPointer];
                if(sum == X){
                     return true;
                } else if (sum < 0){
                    leftPointer++;
                } else {
                    rightPointer--;
                }
        }
        }
        return  false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 1, 8, 35, 45};
        int x = 47;
        int n = arr.length;
        System.out.println(find3Numbers(arr, n, x));
    }
}
