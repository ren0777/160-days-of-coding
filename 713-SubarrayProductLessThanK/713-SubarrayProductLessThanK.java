// Last updated: 6/16/2026, 8:46:33 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int pro=1;
        int count=0;
        int startindex=0;
        
        if(k<=1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            pro*=nums[i];
           while (pro >= k) {
                pro /= nums[startindex]; 
                startindex++; 
            }

            count +=i - startindex + 1;
        }

        return count;
    }
}