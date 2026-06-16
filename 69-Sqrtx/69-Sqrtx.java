// Last updated: 6/16/2026, 8:47:34 AM
class Solution {
    public int mySqrt(int x) {
        long r=x;
        while(r*r > x){
            r=(r+x / r) / 2;
        }
        return (int) r;
    }
}