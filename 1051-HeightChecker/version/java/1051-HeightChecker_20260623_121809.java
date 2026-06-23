// Last updated: 6/23/2026, 12:18:09 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int s=0;
4        int e=nums.length-1;
5        while(s<=e){
6            int mid=(s+e)/2;
7            if(nums[mid]==target) return mid;
8            else if(nums[mid]>target) e=mid-1;
9            else s=mid+1;
10        }
11        return -1;
12    }
13}