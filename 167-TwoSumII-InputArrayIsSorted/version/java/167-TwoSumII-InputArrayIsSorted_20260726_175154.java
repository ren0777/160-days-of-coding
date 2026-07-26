// Last updated: 7/26/2026, 5:51:54 PM
// 2ms
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int s=0;
4        int e=numbers.length-1;
5
6        while(s<e){
7            int sum=numbers[s]+numbers[e];
8
9            if(sum==target) return new int[]{s+1,e+1};
10
11            else if(sum<target) s++;
12
13            else e--;
14        }
15        return new int[]{-1,-1};
16
17    }
18}