// Last updated: 6/16/2026, 8:47:09 AM
class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int a=nums[0];

        for(int i=1;i<n;i++){
            if(a>nums[i]){
                a=nums[i];
            }
        }
        return a;
    }
}