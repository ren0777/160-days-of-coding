// Last updated: 7/12/2026, 2:36:10 PM
1class Solution {
2    public String largestNumber(int[] nums) {
3         String[] numsStr = new String[nums.length];
4        for (int i = 0; i < nums.length; i++) {
5            numsStr[i] = String.valueOf(nums[i]);
6        }
7        Arrays.sort(numsStr, (a, b) -> (b + a).compareTo(a + b));
8
9        if (numsStr[0].equals("0")) return "0";
10       
11        StringBuilder sb = new StringBuilder();
12        for (String s : numsStr) sb.append(s);
13        return sb.toString();
14    }
15}