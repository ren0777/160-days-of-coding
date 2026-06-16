// Last updated: 6/16/2026, 8:47:41 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums==null || nums.length ==0) return 0;
        int s=0,e=nums.length-1;
        while(s<=e){
           int mid=s+(e-s)/2;
            if(nums[mid]==target) return mid;

            else if (nums[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return s;
    }
}