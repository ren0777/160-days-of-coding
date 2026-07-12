// Last updated: 7/12/2026, 1:36:09 PM
1class Solution {
2    public String largestNumber(int[] nums) {
3         String[] asStrs = new String[nums.length];
4        for (int i = 0; i < nums.length; i++) {
5            asStrs[i] = String.valueOf(nums[i]);
6        }
7        Arrays.sort(asStrs, (a, b) -> (b + a).compareTo(a + b));
8
9        if (asStrs[0].equals("0")) {
10            return "0";
11        }
12        StringBuilder largestNumberStr = new StringBuilder();
13        for (String numAsStr : asStrs) {
14            largestNumberStr.append(numAsStr);
15        }
16        
17        return largestNumberStr.toString();
18    }
19}