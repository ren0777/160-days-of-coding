// Last updated: 6/16/2026, 8:46:00 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i=0,c=0;
        while(i<nums.length){
            int j=i+1;
            while(j<nums.length){
                if(nums[i]==nums[j]){
                    c++;
                }
                ++j;
            }
            ++i;
        }
        return c;
    }
}