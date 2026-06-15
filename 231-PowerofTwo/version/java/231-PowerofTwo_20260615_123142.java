// Last updated: 6/15/2026, 12:31:42 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n<=0) return false;
4        while(n!=1){
5            if(n%2==0){
6                n/=2;
7
8            }
9            else{
10                return false;
11            }
12        }
13        return true;
14    }
15}