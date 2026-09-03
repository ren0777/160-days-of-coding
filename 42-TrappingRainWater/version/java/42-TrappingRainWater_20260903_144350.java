// Last updated: 9/3/2026, 2:43:50 PM
1class Solution {
2    public int trap(int[] height) {
3        int n=height.length;
4        int leftMax=height[0],rightMax=height[n-1];
5        int left=0,right=n-1;
6        int ans=0;
7
8        while(left<right){
9            if(leftMax<rightMax){
10                ans += leftMax-height[left];
11                left++;
12                leftMax=Math.max(leftMax,height[left]);
13            }
14            else{
15                ans+=rightMax - height[right];
16                right--;
17                rightMax=Math.max(rightMax,height[right]);
18            }
19        }
20        return ans;
21    }
22}