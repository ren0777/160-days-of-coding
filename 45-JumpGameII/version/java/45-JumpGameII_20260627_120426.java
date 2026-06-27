// Last updated: 6/27/2026, 12:04:26 PM
1class Solution {
2    public int jump(int[] nums) {
3       int n=nums.length;
4       if(n<=1) return 0;
5
6       int jumps=0;
7       int currentEnd=0,farthest=0;
8
9       for(int i=0;i<n-1;i++){
10            farthest=Math.max(farthest,i+nums[i]);
11            if(i==currentEnd){
12                jumps++;
13                currentEnd=farthest;
14                if(currentEnd >= n-1){
15                    break;
16                }
17            }
18        }
19       return jumps;
20    }
21}
22