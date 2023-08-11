 //leetcode 75

import java.util.Arrays;

public class SortColours{
    public void sortColors(int[] nums) {
     int arr[] = new int[nums.length];
        Arrays.fill(arr, 1);
        int si = 0;
        int ei = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                arr[si] = 0;
                si++;
            }
            else if(nums[i] == 2){
                arr[ei] = 2;
                ei--;
            }
        }
        for(int j =0; j<arr.length; j++){
            nums[j] =arr[j];
        }
    }
}
 