// Last updated: 6/16/2026, 8:47:36 AM
class Solution {
    public boolean canJump(int[] nums) {
        int maxReach=0;

        for(int i=0;i<nums.length;i++){
            if(i>maxReach){
                return false;
            }
            maxReach=Math.max(maxReach,i+nums[i]);
            if(maxReach >= nums.length-1){
                return true;
            }
        }
        return true;
    }
}