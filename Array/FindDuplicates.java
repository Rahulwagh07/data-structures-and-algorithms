 

public class FindDuplicates {
    public int findDuplicate(int[] nums) {   //O(n)  O(1)
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        slow = nums[0];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
         
        return fast;
    }
    public  int findDuplicate2(int[] nums) {  // O(n2)  TLE
        int ans = 0;
        for(int i=0; i<nums.length;  i++){
            for(int j=0; j<nums.length; j++){
                if(i == j){
                    continue;
                }
                if(nums[i] == nums[j]){
                    ans = nums[i];
                    
                }
            }
        }
        return ans;
    }
}
