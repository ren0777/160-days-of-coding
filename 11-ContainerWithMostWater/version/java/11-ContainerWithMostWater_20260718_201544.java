// Last updated: 7/18/2026, 8:15:44 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left =0;
4        int right=height.length-1;
5        int maxArea=0;
6
7        while(left < right){
8            int width=right-left;
9
10            int currArea=width * Math.min(height[left],height[right]);
11            maxArea=Math.max(maxArea,currArea);
12
13            if(height[left]<height[right]) left++;
14            else right--;
15        }
16        return maxArea;
17        
18    }
19}