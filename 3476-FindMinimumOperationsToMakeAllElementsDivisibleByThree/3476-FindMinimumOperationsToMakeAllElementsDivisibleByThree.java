// Last updated: 6/16/2026, 8:45:21 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            // if(nums[i]>3*i){
            //     nums[i]=nums[i]-3*i;
            // }
            // else if()
            if(nums[i]%3!=0){
                ++c;
            }
        }
        return c;
    }
}