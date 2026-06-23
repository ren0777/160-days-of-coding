// Last updated: 6/23/2026, 12:45:47 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        if(nums==null || nums.length==0) return 0;
4
5        int s=0,e=nums.length-1;
6        while(s<=e){
7            int mid=s+(e-s)/2;
8
9            if(nums[mid]==target) return mid;
10            else if(target<nums[mid]) e=mid-1;
11            else s=mid+1;
12        }
13        return s;
14    }
15}