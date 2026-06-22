// Last updated: 6/22/2026, 1:12:08 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        k%=n;
5
6        reverse(nums,0,n-1);
7
8        reverse(nums,0,k-1);
9
10        reverse(nums,k,n-1);
11    }
12    public static void reverse(int[] nums,int left,int right){
13        while(left<right){
14            int temp=nums[left];
15            nums[left]=nums[right];
16            nums[right]=temp;
17            left++;
18            right--;
19        }
20    }
21}