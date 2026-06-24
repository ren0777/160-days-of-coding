// Last updated: 6/24/2026, 11:22:17 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int maxAl=0;
4        int currentAl=0;
5        for(int change:gain){
6            currentAl += change;
7
8            maxAl=Math.max(maxAl,currentAl);
9        }
10        return maxAl;
11    }
12}