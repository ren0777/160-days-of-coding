// Last updated: 6/16/2026, 9:45:29 AM
1class Solution {
2    public double myPow(double x, int n) {
3        long N=n;
4        if(N<0){
5            x=1/x;
6            N=-N;
7        }
8        return power(x,N);
9    }
10      private double power(double x, long n) {
11        if (n == 0) return 1;
12
13        double half = power(x, n / 2);
14
15        if (n % 2 == 0) {
16            return half * half;
17        }
18
19        return half * half * x;
20    }
21}