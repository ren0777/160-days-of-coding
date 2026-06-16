// Last updated: 6/16/2026, 10:14:52 AM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if(n<=0){
4            return false;
5        }
6        if(n==1){
7            return true;
8        }
9
10        return (n % 4== 0) && isPowerOfFour(n/4);
11    }
12}