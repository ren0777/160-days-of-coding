// Last updated: 6/17/2026, 12:05:28 AM
// recursion
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if(n<=0) return false;
4        if(n<=1) return true;
5
6        if(n%3!=0) return false;
7        return isPowerOfThree(n/3);
8    }
9}