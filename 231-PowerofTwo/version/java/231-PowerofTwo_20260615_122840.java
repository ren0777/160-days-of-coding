// Last updated: 6/15/2026, 12:28:40 PM
// bit operator
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<=0) return false;
4         return (n & (n - 1)) == 0;
5    }
6}