// Last updated: 7/4/2026, 10:55:27 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        if(n<=1) return true;

        if(n%3!=0) return false;
        return isPowerOfThree(n/3);
    }
}