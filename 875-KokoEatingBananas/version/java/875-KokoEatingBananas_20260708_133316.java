// Last updated: 7/8/2026, 1:33:16 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3       int n = piles.length;
4        long total = 0;
5        for (int num : piles) {
6            total += num;
7        }
8        int start = (int)((total - 1) / h) + 1;
9        int end = (int)((total - n) / (h - n + 1)) + 1;
10        while (start < end) {
11            int mid = start + (end - start) / 2;
12            int time = 0;
13            for (int num : piles) {
14                time += (num - 1) / mid + 1;
15            }
16            if (time > h) {
17                start = mid + 1;
18            } else {
19                end = mid;
20            }
21        }
22        return start;
23    }
24}