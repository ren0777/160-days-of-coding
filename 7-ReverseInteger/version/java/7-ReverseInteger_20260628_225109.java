// Last updated: 6/28/2026, 10:51:09 PM
1class Solution {
2    public int reverse(int x) {
3        int res = 0;
4        
5        while (x != 0) {
6            int d = x % 10; // This naturally handles negative numbers correctly
7            x /= 10;
8            
9            // Check for positive overflow
10            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && d > 7)) {
11                return 0;
12            }
13            // Check for negative overflow
14            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && d < -8)) {
15                return 0;
16            }
17            
18            res = res * 10 + d;
19        }
20        
21        return res;
22    }
23}