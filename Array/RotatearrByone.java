 //cyclically rotate an array by one
public class RotatearrByone {
     
    public void rotate(int arr[], int n)
    {
        int newarr[] = new int[n];
        newarr[0] = arr[n-1];
        for(int i=1; i< n; i++){
            newarr[i] = arr[i-1];
        }
        for (int i=0; i < n; i++){
            arr[i] = newarr[i];
        }
    }
}
