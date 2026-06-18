// Last updated: 6/18/2026, 1:41:59 PM
// random approach
1class Solution {
2    public int majorityElement(int[] nums) {
3          Random rand = new Random();
4        int n = nums.length;
5
6        while (true) {
7            int candidate = nums[rand.nextInt(n)];
8            int count = 0;
9            for (int num : nums) {
10                if (num == candidate) {
11                    count++;
12                }
13            }
14            if (count > n / 2) {
15                return candidate; 
16        }    }
17    }
18}