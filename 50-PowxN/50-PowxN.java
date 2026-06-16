// Last updated: 6/16/2026, 9:47:02 AM
class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        return power(x,N);
    }
      private double power(double x, long n) {
        if (n == 0) return 1;

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return half * half * x;
    }
}