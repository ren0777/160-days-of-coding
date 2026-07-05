// Last updated: 7/5/2026, 10:09:02 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int[] runningSum = new int[nums.length];
4        int cumulativeSum = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            cumulativeSum += nums[i];
8            runningSum[i] = cumulativeSum;
9        }
10
11        return runningSum;
12
13    }
14}