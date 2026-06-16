// Last updated: 6/16/2026, 8:47:38 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=0;
        int maxa=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
                if(currsum<0)
                {
                    currsum=0;
                }
                currsum+=nums[i];
                maxa=Math.max(currsum,maxa);
        }
        return maxa;
    }
}