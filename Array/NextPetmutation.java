public class NextPetmutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
    if (n <= 1) {
        return;
    }
    
    int lastInc = -1;
    //find the peak from last ASC ordrer
    for (int j = n - 2; j >= 0; j--) {
        if (nums[j] < nums[j + 1]) {
            lastInc = j;  //found the peak update the index
            break;
        }
    }
    //Special case if arr is sorted in dec order
    if (lastInc == -1) {
        reverse(nums, 0, n - 1);
        return;
    }
    
    int index = lastInc + 1;
    // Find the element to swap from the range (lastInc + 1) to n - 1
    for (int i = lastInc + 1; i < n; i++) {
        if (nums[i] > nums[lastInc] && nums[i] <= nums[index]) { 
            index = i;
        }
    }
    
    swap(nums, lastInc, index);
    //Reverse the remaining part of the array to make it the smallest permutation
    reverse(nums, lastInc + 1, n - 1);
}

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
}
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4, 2};
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        nextPermutation(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
