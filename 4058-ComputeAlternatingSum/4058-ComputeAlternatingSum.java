// Last updated: 6/16/2026, 8:45:16 AM
class Solution {
    public int alternatingSum(int[] nums) {
        int sum=0;
        int  dif=0;
        int n=nums.length;
        for(int i=0;i<n;i=i+2)
        {
            sum+=nums[i];
            if(i+1<n){
            dif+=nums[i+1];
            }
        }
        return  (sum-dif);
    }
}